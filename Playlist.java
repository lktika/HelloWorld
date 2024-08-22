import java.util.Arrays;
import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    String[] favoriteSongs = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

    System.out.println(favoriteSongs[0]);
    System.out.println(favoriteSongs[1]);
    System.out.println(favoriteSongs[2]);

    ArrayList<String> desertIslandPlaylist = new ArrayList<>(); 
    desertIslandPlaylist.add("k");
    desertIslandPlaylist.add("l");
    desertIslandPlaylist.add("m");
    desertIslandPlaylist.add("n");
    desertIslandPlaylist.add("o");

    System.out.println(desertIslandPlaylist); 

    desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs)); 
    desertIslandPlaylist.size();
    desertIslandPlaylist.remove("a");
    desertIslandPlaylist.remove("b");
    desertIslandPlaylist.remove("c");
    desertIslandPlaylist.remove("d");
    desertIslandPlaylist.remove("e");

    int indexA = desertIslandPlaylist.indexOf("f");
    int indexB = desertIslandPlaylist.indexOf("g");

    String tempA = "f";
    desertIslandPlaylist.set(indexA, "g");
    System.out.println(desertIslandPlaylist);

    desertIslandPlaylist.set(indexB, tempA);

    System.out.println(desertIslandPlaylist);
  }
  
}