import java.util.Scanner;

    class Gettinginputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Year: ");
        int year = input.nextInt();
        
        input.nextLine();

        System.out.print("Enter The Genre: ");
        String genre = input.nextLine();
        

        System.out.print("Enter The Album: ");
        String Album = input.nextLine();
        

        System.out.print("Enter The Song title: ");
        String songtit = input.nextLine();
        

        System.out.print("Enter The Artist: ");
        String art = input.nextLine();
        

        System.out.println("-------------------");
        System.out.println(   "SONG DETAILS"        );
        System.out.println("-------------------");
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre); 
        System.out.println("Album: " + Album);
        System.out.println("Song Title: " + songtit);
        System.out.println("Artist: " + art);

    }
}
    

  