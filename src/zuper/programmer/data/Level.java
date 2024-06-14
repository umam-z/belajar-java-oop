package zuper.programmer.data;

import zuper.programmer.annotation.Fancy;

@Fancy(name = "Level", tags = {"Application", "Java"})
public enum Level {
    // enum dengan constructor
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String description;

    /**
     * saat membuat constructor suatu enum maka otomatis opsi enumnya harus langsung memanggil
     * constructor tsb. misal ada parameter diconstructor maka di semua opsi enum wajib mengisi
     * nilai dari paremeter sesuai dengan jumlah dan tipe datanya.
     * @param description
     */
    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
