import java.util.*;

public class _8_EjerLab {

  public static class Song {
    //Atributos
    private String nombre;
    private String artista;
    private String album;
    private int duracion;

    //Constructor
    public Song(String nombre, String artista, String album, int duracion) {
      this.nombre = nombre;
      this.artista = artista;
      this.album = album;
      this.duracion = duracion;
    }

    //Getters
    public String getNombre(){
      return nombre;
    }

    public String getArtista(){
      return artista;
    }

    public String getAlbum(){
      return album;
    }
    
    public int getDuracion(){
      return duracion;
    }
  }

  public static class Playlist {
    //Atributos
    private String nombre;
    private Song canciones;

    Song listArray[] = new Song[10];

    //Constructor
    public Playlist(String nombre) {
      this.nombre = nombre;
    }

    //Agregar cancion a la playlist 2 metodos
    public void agregarCancionPlaylist(Song x, int metodo) {
      if (metodo == 1) {

      } else {
        
      }
    }
    
    //Quitar cancion
    public void quitarCancionPlaylist(Song x) {

    }
    
    //Modificiar Playlist
    public void editarPlaylist(int x, int y) {
      
    }

  }

  public static class Player {
    private Playlist list;
    private Queue<Song> colaReproduccion = new LinkedList<Song>();

    public void agregarCancionCola(Song x) {

    }

    public void quitarCancionCola(Song x) {

    }

    public void reproducirColaEnOrden(Playlist x) {

    }

    public void reproducirPlaylistEnOrden(Playlist x) {

    }

    public void reproducirAleatoriamente(Playlist x) {

    }

    public void reproducirIntercaladoAleatorio(Playlist x, Playlist y) {

    }
  }

  
  //Metodo main
  public static void main(String[] args) {
    
  }
}
