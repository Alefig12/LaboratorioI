package Arbol;

import Prinicipal.ListaEnlazada;

/**
 * Clase que abstrae la idea del User
 * @author Isaac Blanco
 */
public class User extends Nodo {

    private final int ID;
    private String username;
    private String email;
    private Persona persona;

    /**
     * Constructor privado del Usuario, con el fin de evitar su creacion por alguien distinto a el mismo.
     *
     * @param ID ID del Usuario
     * @param username Nombre de usuario del Usuario
     * @param email Email asociado al Usuario
     */
    private User(int ID, String username, String email) {
        super();
        this.ID = ID;
        this.username = username;
        this.email = email;
        hijos = new ListaEnlazada();
    }

    /**
     * Constructor publico del Usuario, para crear un Nodo vacio
     */
    public User() {
        this.ID = 0;
        hijos = new ListaEnlazada();
    }

    /**
     * Metodo encargado de crear el Usuario
     *
     * @param id ID del Usuario
     * @param username Username del Usuario
     * @param email Email asociado e
     * @return user Devuelve un usuario nuevo
     */
    public static User createUser(int id, String username, String email) {
        return new User(id, username, email);
    }

    /**
     * Metodo que devuelve el ID del User
     * @return ID ID del User
     */
    public int getID() {
        return ID;
    }

    /**
     * Metodo que devuelve el Username del User
     * @return username Username del User
     */
    public String getUsername() {
        return username;
    }

    /**
     * Metodo que devuelve el E-Mail del User
     * @return email E-Mail del User
     */
    public String getEmail() {
        return email;
    }

    /**
     * Metodo que devuelve un Objeto de tipo {@link Persona} del User
     * @return persona Objeto {@link Persona} del User
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * Metodo que inicializa un Objeto de tipo {@link Persona} al User
     * @param persona Persona a añadir al User
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    /**
     * Metodo que obtiene los hijos de un User
     * @return hijos Hijos del User
     */
    public ListaEnlazada<Nodo> getPosts() {
        return hijos;
    }

    /**
     * Metodo que se encarga de añadir una {@link Persona} al User
     * @param info {@code LinkedList<String>} que contiene los datos para crear la Persona y sus partes
     */
    public void addPersona(ListaEnlazada<String> info) {
        this.persona = new Persona(info.get(1), info.get(10), info.get(11), this);
        this.persona.setAdress(info.get(4), info.get(5), info.get(6), info.get(7), info);
    }

    /**
     * Metodo que añade un Post al User
     * @param post Nodo a añadir 
     */
    public void setPost(Nodo post) {
        if (post != null) {
            hijos.add(post);
        }
    }
    
    /**
     * Metodo que se encarga de obtener un Post especifico, partiendo de su ID
     * @param id ID del Post a buscar
     * @return p {@link Post} devuelve el Post a buscar, {@code null} en caso de no encontrarlo 
     */
    public Post getPost(int id) {
        for (Object post : hijos) {
            Post p = (Post) post;
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    /**
     * Metodo que se encarga de obtener un Post especifico, partiendo de su titulo
     * @param title Titulo del Post a buscar
     * @return p {@link Post} devuelve el Post a buscar, {@code null} en caso de no encontrarlo 
     */
    public Post getPost(String title) {
        for (Object post : hijos) {
            Post p = (Post) post;
            if (p.getTitle().equals(title)) {
                return p;
            }
        }
        return null;
    }

    /**
     * Metodo que se encarga de verificar si el User tiene un Post con ese ID
     *
     * @param postId ID del Post a buscar
     * @return Post {@code True} si encuentra el Post a buscar, {@code False} en caso contrario
     */
    public boolean checkPostId(int postId) {
        for (Object post : hijos) {
            Post p = (Post) post;
            if (p.getId() == postId) {
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo que se encarga de verificar si el User tiene un Post con un titulo en especifico
     *
     * @param postTitle Titulo del Post a buscar
     * @return Post {@code True} si encuentra el Post a buscar, {@code False} en caso contrario
     */
    public boolean checkPostName(String postTitle) {
        for (Object post : hijos) {
            Post p = (Post) post;
            if (p.getTitle().equals(postTitle)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo que se encarga de la busqueda de un Comment en especifico, partiendo de su ID
     *
     * @param ID ID del Comment a buscar
     * @return Comment Comment a buscar en especifico, {@code null} en caso de no encontrarlo
     */
    public Comment getComment(int ID) {
        for (Object nodo : this.getPosts()) {
            Post p = (Post) nodo;
            if (p.getComment(ID) != null) {
                return (Comment) p.getComment(ID);
            }
        }
        return null;
    }

    /**
     * Metodo que se encarga de la busqueda de un Comment en especifico, partiendo de su titulo, cuerpo o email del creador.
     *
     * @param title Titulo, email o cuerpo del Comment
     * @return Comment Comment a buscar en especifico, {@code null} en caso de no encontrarlo
     */
    public Comment getComment(String title) {
        for (Object nodo : this.getPosts()) {
            Post p = (Post) nodo;
            if (p.getComment(title) != null) {
                return (Comment) p.getComment(title);
            }
        }
        return null;
    }

    // Test only use

    /**
     * Metodo de prueba que se encarga de mostrar toda la informacion por consola del User
     */
    public void mostrarUser() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID del user:" + this.ID).append("\n Email del user: " + this.email).append("\n Nombre de usuario:" + this.username);
        System.out.println(sb.toString());
        for (Object nodo : hijos) {
            Post p = (Post) nodo;
            p.mostrarPost();
        }
    }

    /**
     * Metodo encargado de obtener la cantidad de Nodos que posee un Arbol especifico
     *
     * @return cont Cantidad numerica de {@link Nodo} que tiene el Arbol
     */
    public int getTam() {
        int cont = this.hijos.size();
        for (Object n : hijos) {
            Post p = (Post) n;
            cont += p.getComments().size();
        }
        return cont;
    }

    /**
     * Metodo que se encarga de contar la cantidad de Nodos de tipo Comment de un Arbol partiendo del User
     *
     * @return cont Cantidad numerica de {@link Nodo} de tipo Comment
     */
    public int getAllComments() {
        int cont = 0;
        for (Object n : hijos) {
            Post p = (Post) n;
            cont += p.getComments().size();
        }
        return cont;
    }
    
    @Override
    public String getAllData(){
        StringBuilder sb = new StringBuilder();
        sb.append("U").append(",").append(this.ID).append(",").append(this.username).append(",").append(this.email).append("\n").append(this.persona.getAllData());
        for(Object nodo: this.getHijos()){
            Post p = (Post) nodo;
            sb.append(p.getAllData());
            System.out.println("ID :" + p.getId());
        }
        return sb.toString();
    }
    
    /**
     * Metodo que se encarga de a partir de los datos de las clases {@link Persona}, {@link Direccion}, {@link Coordenada} y {@link Compañia} completar la creacion de un objeto User 
     * @param user User el cual debe ser terminado, necesario para la bidirecionalidad con Persona
     * @param personaData {@link ListaEnlazada} con los datos seperados del objeto {@link Persona}
     * @param adressData {@link ListaEnlazada} con los datos separados del objeto {@link Direccion}
     * @param geoData {@link ListaEnlazada} con los datos separados del objeto {@link Coordenada}
     * @param companyData {@link ListaEnlazada} con los datos separados del objeto {@link Compañia}
     */
    public void setAllData(User user, ListaEnlazada<String> personaData, ListaEnlazada<String> adressData, ListaEnlazada<String> geoData, ListaEnlazada<String> companyData){
        this.persona = new Persona(personaData.get(0),personaData.get(1),personaData.get(2),user);
        this.persona.setAdress(new Direccion(adressData.get(0),adressData.get(1),adressData.get(2),adressData.get(3)));
        this.persona.getAdress().setGeo(Float.parseFloat(geoData.get(0)), Float.parseFloat(geoData.get(1)));
        this.persona.setCompany(new Compañia(companyData.get(0),companyData.get(1),companyData.get(2)));
    }
}
