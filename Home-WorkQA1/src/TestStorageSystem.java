
//Пример структуры основного класса программы

public class TestStorageSystem {
/*Принцип работы приложения следующий:
С консоли вводится три наименования продукта,
на основе наименований, создаются продукты трех различных типов (TechProduct,FoodProduct,BookProduct)

Создается объект Truck, на основе класса Truck, который будет отвечать за перевозку данных продуктов
до склада, у данного класса должна быть переменная - массив, в которую нужно добавить все созданные
продукты.
Так как продукты трех различных типов, то собрать их вместе мы можем только в массиве, который будет
иметь общий тип данных для всех - Product
Так как придерживаемся принципа инкапсуляции, то доступ к переменной, в которой храним продукты,
тоже сделать через отдельный метод.

Давайте под итожим:
На данном этапе должно быть создано четыре объекта: Объекты типов TechProduct,FoodProduct,BookProduct и
объект типа Truck, в который нужно поместить вышеуказанные объекты.
==========
Необходимо загрузить трак продуктами и сообщить об этом.

Создайте объект типа Storage - это склад, в котором будут храниться разгруженные продукты,
хранить продукты можно по аналогии с переменной хранения в траке

Выгрузить все продукты из трака, сообщить об этом и вывести список продуктов в траке и на складе.

Задание со * :
Добавьте возможность ввести с консоли тип трака - "Big,Medium,Small"
В зависимости от введенного типа, создавайте траки разных классов !!!
Но при этом основной код разгрузки и загрузки не должен меняться(Полиморфизм и работа с общими типами)) )
 */



    //Пример структуры основного класса программы


        public static void main(String[] args) {
            //Ввод с консоли имен продуктов и создание объектов различных типов
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input tech product name :");
            String techname = scanner.next();
            TechProduct techProduct = new TechProduct();
            techProduct.setName(techname);

            System.out.println("Input food product name :");
            String foodname = scanner.next();
            FoodProduct foodProduct = new FoodProduct();
            foodProduct.setName(foodname);

            System.out.println("Input book product name :");
            String bookname = scanner.next();
            BookProduct bookProduct = new BookProduct(bookname);

            Truck truck = new Truck();
            truck.loadProductToTruck(techProduct);
            truck.loadProductToTruck(foodProduct);
            truck.loadProductToTruck(bookProduct);

            System.out.println("All products in truck : ");
            truck.printAllProductsFromTruck();

            System.out.println("Track is loaded and ready to go");

            Storage storage = new Storage();

            //Разгрузите трак в созданный storage
            for (int i = 0; i < 5; i++) {
                Product product = truck.unloadProductFromTruck();
                if (product == null) {
                    break;
                }
                storage.loadProductToStorage(product);
            }

            System.out.println("All product in storage :");
            storage.printAllProductsFromStorage();
        }

        private static void loadTruck(Truck truck, Product[] products) {
            // здесь должна быть логика загрузки всех продуктов в переданный трак
        }

        private static void unloadTruckToStorage(Storage storage, Truck truck) {
            //  Здесь должна быть логика загрузки всех товаров из трака на склад и
            //  удаление их из трака
        }
    }
