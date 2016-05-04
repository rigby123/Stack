package pila;
import java.util.Stack;

public class ejercicios {
    Stack pila=new Stack();
    
    public void E_1(){
        System.out.println("cree una pila con los nombres de sus juegos favoritos y realice las operaciones anteriormentes descritas");
        pila.push("counter strike");
        pila.push("hitman");
        pila.push("left for dead");
        pila.push("devil may cry");
        pila.push("dead space");
        pila.push("clash of clans");
        pila.push("garys mod");
         
        System.out.println("tamaño pila: "+pila.size());
        System.out.println(pila);
        System.out.println("la cima: "+pila.peek());
        System.out.println("elemento desapilado: "+pila.pop());
        System.out.println(pila.search("clash of clans"));
        System.out.println(pila);
        System.out.println("esta vacia? "+pila.empty());
    }   //listo
    public void E_2(){
        Stack zxc = new Stack();
        System.out.println("cree una pila con cinco notas y despliegue estas con un bucle for. Utilize el metodo get()");
        zxc.push(6.0);
        zxc.push(4.0);
        zxc.push(5.0);
        zxc.push(7.0);
        zxc.push(7.0);
        
        for (int i = 0; i < zxc.size(); i++) {
            System.out.println(zxc.get(i));
        }
        
    }
    public void E_3(){
        System.out.println("cree un ejercicio similar al anterior, pero con un ciclo for each");
        Stack asd = new Stack();
        
        asd.push("jaja");
        asd.push("jeje");
        asd.push("jiji");
        asd.push("jojo");
        asd.push("juju");
        
        for (Object op:asd) {
            System.out.println(op);
        }
    }   //listo
    public void E_4(){
        System.out.println("cree una pila con los nombres de los ultimos libros que ha leido y vacie esta de forma automatica con un bucle while");
        Stack qwe = new Stack();
        qwe.push("el quijote de la mancha");
        qwe.push("el secreto");
        qwe.push("harry potter");
        qwe.push("todos mienten");
        
        while(!qwe.empty()){
            System.out.println(qwe.pop());
        }
            
        
    }   //listo
}
