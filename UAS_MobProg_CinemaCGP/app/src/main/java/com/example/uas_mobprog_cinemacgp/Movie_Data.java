package com.example.uas_mobprog_cinemacgp;

import java.util.ArrayList;
import java.util.List;

public class Movie_Data {

    public static List<Movie> getMovieList(){
        Movie movie1 = new Movie("Black Panther: Wakanda Forever", "2022", "Rakyat Wakanda kali ini akan berjuang untuk melindungi negerinya dari campur tangan kekuatan dunia setelah kematian sang Raja T'Challa.", "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/sv1xJUazXeYqALzczSZ3O6nkH75.jpg", "75", "Aksi, Petualangan, Cerita Fiksi");
        Movie movie2 = new Movie("Puss in Boots: The Last Wish ", "2022", "Puss in Boots menemukan fakta bahwa kecintaannya pada petualangan telah merenggut nyawanya: dia telah menghabiskan delapan dari sembilan nyawanya. Puss kini memulai petualangan epik untuk menemukan harapan terakhir untuk memulihkan sembilan nyawanya.", "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/kuf6dutpsT0vSVehic3EZIqkOBt.jpg", "86", "Animasi, Petualangan, Komedi, Keluarga, Fantasi");
        Movie movie3 = new Movie("AVATAR 2: THE WAY OF WATER", "2022", "Jake Sully tinggal bersama keluarga barunya di planet Pandora. Setelah ancaman kembali datang, Jake harus bekerja dengan Neytiri dan pasukan ras Na'vi untuk melindungi planet mereka.", "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/t6HIqrRAclMCA60NsSmeqe9RmNV.jpg", "77", "Cerita Fiksi, Petualangan, Aksi");
        Movie movie4 = new Movie("Titanic", "1997", "101-year-old Rose DeWitt Bukater tells the story of her life aboard the Titanic, 84 years later. A young Rose boards the ship with her mother and fiancé. Meanwhile, Jack Dawson and Fabrizio De Rossi win third-class tickets aboard the ship. Rose tells the whole story from Titanic's departure through to its death—on its first and last voyage—on April 15, 1912.", "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/9xjZS2rlVxm8SFx8kPC3aIGCOYQ.jpg", "79", "Drama, Percintaan");
        Movie movie5 = new Movie("Violent Night", "2022", "Ketika sebuah tim tentara bayaran masuk ke kompleks keluarga kaya pada Malam Natal, menyandera semua orang, tim tidak siap untuk kombatan kejutan: Sinterklas ada di lapangan, dan dia akan menunjukkan mengapa Nick ini bukan orang suci.", "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1XSYOP0JjjyMz1irihvWywro82r.jpg", "77", "Aksi, Komedi, Kejahatan, Cerita Seru");
        Movie movie6 = new Movie("M3GAN", "2022", "A brilliant toy company roboticist uses artificial intelligence to develop M3GAN, a life-like doll programmed to emotionally bond with her newly orphaned niece. But when the doll's programming works too well, she becomes overprotective of her new friend with terrifying results.", "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/d9nBoowhjiiYc4FBNtQkPY7c11H.jpg", "76", "Cerita Fiksi, Kengerian, Komedi");

        List<Movie> list = new ArrayList<>();
        list.add(movie1);
        list.add(movie2);
        list.add(movie3);
        list.add(movie4);
        list.add(movie5);
        list.add(movie6);
        return list;
    }
}
