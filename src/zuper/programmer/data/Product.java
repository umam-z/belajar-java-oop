package zuper.programmer.data;

public class Product {
    public String name;
    public int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // public boolean equals(Object obj) {
    //     if (this == obj) return true;
    //     if (obj == null) return false;
    //     if (getClass() != obj.getClass())return false;

    //     Product other = (Product) obj;

    //     if (name == null) {
    //         if (other.name != null) return false;
    //     } else if (!name.equals(other.name))
    //         return false;
    //     if (price != other.price)
    //         return false;
    //     return true;
    // }

    public String toString() {
        return "Product name : " + name + ", Price : " + price ;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    // public boolean equals(Object o) {
    //     /**
    //      * pastikan objek saat ini memiliki lokasi yang sama di memory
    //      * dengan object yang akan dibanding lalu return true
    //      *  */ 
    //     if (this == o){
    //         return true;
    //     }

    //     /**
    //      * pastikan object yang akan dibandingkan merupakan instance dari
    //      * kelas ini(Product) ataupun turunannya. 
    //      */
    //     if (!(o instanceof Product)) {
    //         return false;
    //     }

    //     /**
    //      * untuk memastikan. konversi object yang bandingkan menjadi object 
    //      * dari kelas ini
    //      */
    //     Product product = (Product) o;

    //     /**
    //      * jika sudah menjadi object class ini bandingkan property price
    //      * jika nilainya beda return false;
    //      */
    //     if (price != product.price) {
    //         return false;
    //     }

    //     // jika property name object object saat ini tidak null (kosong)
    //     if (name != null) {
    //         // bandingkan isinya jika sama true jika tidak false
    //         return name.equals(product.name);
    //     } else {
    //         // bandingkan nilai obeject yang akan dibandingkan dengan null
    //         return product.name == null;
    //     }
    // }

}
