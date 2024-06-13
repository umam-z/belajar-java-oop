package zuper.programmer.application;

public class EqualsApp {
    public static void main(String[] args) {

        // string pertama
        String first = "Moh. Sirajul";
        first = first + " Umam";
        System.out.println(first);

        // string kedua
        String second = "Moh. Sirajul Umam";
        System.out.println(second);

        // false karena beda object
        System.out.println(first == second);
        // true karena membandingkan nilai
        System.out.println(first.equals(second));
        
        String third = "Moh. Sirajul Umam";

        /**
         * true karena java mengoptimalisasi memori ketika ada dua buah object 
         * yang memiliki nilai sama persis. dalam hal ini karena  nilai object
         * second diacu kembali oleh third maka ketika dibandingkan second dan
         * third nilainya adalah true sebab keduanya mengacu pada satu lokasi
         * nilai yang sama.
         * 
         */
        System.out.println(second ==  third);

        // true karena membandingkan nilai
        System.out.println(second.equals(third));
    }

}
