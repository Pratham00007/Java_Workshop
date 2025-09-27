// class String_func{
//     public static void main(String a[]){
//         String s1=new String ("Niet");
//         String s2=new String ("college");
//         System.out.println(s1.concat(s2));
//     }
// }

// class String_func{
//     public static void main(String a[]){
//         String s="Niet";
//         for (int i=0;i<s.length();i++){
//             System.out.println(s.charAt(i));
//         }

//     }
// }

// class String_func{
//     public static void main(String a[]){
//         String s="Niet";
//         System.out.println(s.toUpperCase());
//         System.out.println(s.toLowerCase());
//         System.out.println(s);

//     }
// }

/* split-> return array divided word on space
 trim start and end ke faltu space hata
*/

class String_func{
    public static void main(String a[]){
        String s="    Niet is a college       ";
        String b[]=s.split(" ");
        for (int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

        System.out.println(s.trim());
        System.out.println(s);

    }
}