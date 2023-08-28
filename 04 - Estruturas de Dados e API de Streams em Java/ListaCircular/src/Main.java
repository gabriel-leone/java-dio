public class Main {

    public static void main(String args[]){

        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.add("Gabriel");
        System.out.println(minhaListaCircular);

        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);

        minhaListaCircular.add("Carlos");
        System.out.println(minhaListaCircular);

        minhaListaCircular.add("Maria Clara");
        minhaListaCircular.add("Rodolfo");
        System.out.println(minhaListaCircular);

    }

}