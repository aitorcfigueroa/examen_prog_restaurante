public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al restaurante Aitor");
        Menu menu = new Menu();
        int select;
        do {
            System.out.println("Desea ver el menú actual o generar uno nuevo: " +
                    "\n1 - Ver menú actual " +
                    "\n2 - Generar nuevo menú " +
                    "\n0 - Salir.");
            select = Input.num();
            if (select == 1) {
                ShowMenu(menu);
            } else if (select == 2) {
                menu = new Menu();
            } else if (select == 0) {
                System.out.println("Hasta pronto!");
            } else {
                System.out.println("Opción no disponible. Por favor, seleccione una de las opciones válidas.");
            }
        } while (select != 0);
    }

    public static void ShowMenu(Menu menu) {
        System.out.println(menu);
        int select;
        do {
            System.out.println("¿Desea guardar el menú?: " +
                    "\n1 - Sí, guardalo. " +
                    "\n0 - No, no lo guardes.");

            select = Input.num();
            if (select == 1) {
                File saveObject = new File();
                boolean confirm = saveObject.objectWriter(menu, "menu.txt", false);
                if (confirm) {
                    System.out.println("Menú guardado.");
                } else {
                    System.out.println("Error al guardar el menú.");
                }
                select = 0;
            }
        } while (select != 0);
    }
}
