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
    //Atributos List y Arraylist
    private String nombre;
    List<Song> canciones = new LinkedList<>();
    Song listArray[] = new Song[10];
    int disp, current;
    //Atributos Cola y ArrayCola
    Queue<Song> colaCanciones = new LinkedList<>();
    Song colaArray[] = new Song[10];
    int tamano, recorrido;
    

    //Constructor
    public Playlist(String nombre) {
      this.nombre = nombre;
      disp = 10;
      current = 0;
    }

    public String getNombre() {
      return nombre;
    }

    //Agregar cancion a la playlist 2 metodos
    public void agregarCancionPlaylistList(Song x) {
      canciones.add(x);
    }

    public void agregarCancionPlaylistArray(Song song) {
      if (disp > 0) {
        listArray[current] = song;
        disp--;
        current++;
        System.out.println("La cancion fue agregada a la Playlist en la posicion " + current + ".");
      } else {
        Queue<Song> copia = new LinkedList<>();

        for (int i = 0; i < listArray.length; i++) {
          copia.add(listArray[i]);
        }

        int tamanoNuevo = (listArray.length + 10);
        disp = tamanoNuevo - (current - 1);
        listArray = new Song[tamanoNuevo];

        for (int i = 0; !copia.isEmpty(); i++) {
          listArray[i] = copia.poll();
        }

        listArray[current] = x;
        System.out.println("La playlist fue extendida y la cancion fue agregada en el lugar " + current);
        current++;
      }
    }
    
    //Quitar cancion a la playlist 2 metodos
    public void quitarCancionPlaylist(Song x) {
      if (canciones.isEmpty()) {
        System.out.println("La playlist se encuentra vacia.");
      } else {
        canciones.remove(x);
      }
    }

    public void quitarCancionPlaylistArray(Song x) {
      for (int i = 0; i < listArray.length; i++) {
        if (listArray[i] == x) {
          listArray[i] = null;
        }
      }
    }
    
    //Modificiar Playlist
    public void editarPlaylist(int x, int y) {
      if (canciones.get(x) != null && canciones.get(y) != null) {
        Song canUno = canciones.get(x);
        Song canDos = canciones.get(y);

        canciones.set(x, canUno);
        canciones.set(y, canDos);
      }
      else if (canciones.get(x) == null && canciones.get(y) == null) {
        System.out.println("Las canciones en la posicion " + x + " " + y + " no existen.");
      }
      else if (canciones.get(x) == null) {
        System.out.println("La cancion en la posicion " + x + " no existe.");
      } else if (canciones.get(y) == null) {
        System.out.println("La cancion en la posicion " + y + " no existe.");
      }
    }

    public void editarPlaylistArray(int x, int y) {
      if (listArray[x] != null && listArray[y] != null) {
        Song aux = listArray[x];
        listArray[x] = listArray[y];
        listArray[y] = aux;

        System.out.println("Las canciones en las posiciones " + x + " " + y + " fueron cambiadas.");
      }
      else if (listArray[x] == null && listArray[y] == null) {
        System.out.println("Las canciones en la posicion " + x + " " + y + " no existen.");
      }
      else if (listArray[x] == null) {
        System.out.println("La cancion en la posicion " + x + " no existe.");
      }
      else if (listArray[y] == null) {
        System.out.println("La cancion en la posicion " + y + " no existe.");
      }
    }


    // --------------------------------------------------

    // Agregar cancion a la cola
    public void agregarCancionCola(Song x) {
      colaCanciones.add(x);
    }

    public void agregarCancionColaArray(Song x) {
      if (tamano > 0) {
        colaArray[recorrido] = x;
        tamano--;
        recorrido++;
        System.out.println("Se agrego la cancion a la cola de reproduccion en la posicion " + recorrido);
      } else {
        Queue<Song> copia2 = new LinkedList<>();

        for (int i = 0; i < colaArray.length; i++) {
          copia2.add(colaArray[i]);
        }

        int tamNuevo = (colaArray.length + 10);
        tamano = tamNuevo - (recorrido - 1);
        colaArray = new Song[tamNuevo];

        for (int i = 0; !copia2.isEmpty(); i++) {
          colaArray[i] = copia2.poll();
        }

        colaArray[recorrido] = x;
        System.out.println("La cola fue modificada y la cancion fue agregada en la posicion " + recorrido);
        recorrido++;
      }
    }

    // Quitar cancion de la cola
    public void quitarCancionCola(Song x) {
      Queue<Song> colaCopia = new LinkedList<>();

      while (!colaCanciones.isEmpty()) {
        Song cancion = colaCanciones.poll();
        if (!cancion.equals(x)) {
          colaCopia.add(cancion);
        }
      }

      colaCanciones = colaCopia;
    }
    
    public void quitarCancionColaArray(Song x) {
      for (int i = 0; i < colaArray.length; i++) {
        if (colaArray[i] == x) {
          colaArray[i] = null;
        }
      }
    }

  }

  public static class Player {
    // private Playlist list;
    // private Queue<Song> cola_reproduccion = new LinkedList<>();


    //Reproducir la cola en 2 metodos
    public void reproducirColaEnOrden(Playlist x) {

    }
    
    public void reproducirColaEnOrdenList(Playlist x) {

    }

    //Reproducir la playlist en 2 metodos
    public void reproducirPlaylistEnOrden(Playlist x) {

    }

    //Reproducir Aleatorio
    public void reproducirAleatoriamente(Playlist x) {

    }

    public void reproducirIntercaladoAleatorio(Playlist x, Playlist y) {

    }
  }

  
  //Metodo main
  public static void main(String[] args) {
    
  }
}
