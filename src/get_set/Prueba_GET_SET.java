package get_set;

public class Prueba_GET_SET {

    public static void main(String[] args) {
        
       Alumno lib = new Alumno();
        
        
        System.out.println("---caracteristicaa del libro-------");
        
        
        System.out.println("el tema del cuento es: ");
        lib.setTema("Blanca nieves");
        System.out.println(lib.getTema());
        
        System.out.println("El año en el que salio fue en el: ");
        lib.setAno(2002);
        System.out.println(lib.getAno());
        
        
        System.out.println("El precio que tiene este cuento es de : ");
        lib.setPrecio(12);
        System.out.println(lib.getPrecio()+ "$");

        


                
        
    }
    
}
