
package dev.primakara;


public class produk {
    private String ID_Barang;
    private String Produk;
    private int Harga; 
    private String tgl_masuk;
    private String tgl_keluar;
    private String ID_Lokasi;

    
    public produk (String ID_Barang, String Produk, int Harga, String tgl_masuk, String tgl_keluar, String ID_Lokasi)
    {
        this.ID_Barang =ID_Barang;
        this.Produk = Produk;
        this.Harga = Harga;
        this.tgl_masuk = tgl_masuk;
        this.tgl_keluar = tgl_keluar;
        this.ID_Lokasi = ID_Lokasi;
    }
    

    public String getID_Barang()
    {
        return ID_Barang;
    }
    
    public String getProduk()
    {
        return Produk;
    }
    
    public int getHarga()
    {
        return Harga;
    }
    
    public String gettgl_masuk()
    {
        return  tgl_masuk;
    }
    
     public String gettgl_keluar()
    {
        return  tgl_keluar;
    }
     
       public String getID_Lokasi()
    {
        return  ID_Lokasi;
    }
}
