package Objects_and_Classes_Lab_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Songs_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSongs = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < numSongs; i++) {
            String[] data = scanner.nextLine().split("_");
            Song song = new Song(data[0], data[1], data[2]);
            songs.add(song);
        }

        String typeList = scanner.nextLine();

        if (typeList.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            List<Song> filterSong = songs.stream().filter(e -> e.getTypeList().equals(typeList))
                    .collect(Collectors.toList());

            for (Song song : filterSong) {
                System.out.println(song.getName());
            }
        }
    }
}
