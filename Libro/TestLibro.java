package Libro;
public class TestLibro {
    public static void main(String[] args) {
        Libro miLibro = new Libro();
        miLibro.setTitulo("Principito");
        miLibro.setAutor("Antoine de Saint-Exupéry");
        miLibro.setISBN("978-84-7888-628-9");
        miLibro.setPaginas(250);
        miLibro.setEdicion("1.");
        miLibro.setEditorial("SALAMANDRA, S.A., EDICIONES");
        miLibro.setLugar(" Barcelona", "Cordoba");
        miLibro.setFecha_edicion("06/04/2016");
        imprimirInfoLibro(miLibro);
     
    }
    
    
    public static void imprimirInfoLibro(Libro r){
        System.out.println("Titulo: " + r.getTitulo());
        System.out.println(r.getEdicion() + "Edicion");
        System.out.println("Autor: "+ r.getAutor());
        System.out.println("ISBN: " + r.getISBN());
        System.out.println(r.getEditorial() + ","+ r.getLugar() + ","+ r.getFecha_edicion());
        System.out.println(r.getPaginas() + " Paginas");
        System.out.println("-----------------------------------");
    }
}