class StationaryTester{

public static void main(String items2[]){

Stationary.addItems("pencil");
Stationary.addItems("book");
Stationary.addItems("pen");
Stationary.addItems("sticky notes");
Stationary.addItems("highliter");
Stationary.addItems("eraser");
Stationary.addItems("marker");
Stationary.addItems("tape");
Stationary.addItems("glue");
Stationary.addItems("files");

Stationary.getItems();

Stationary.updateItem("scissor" , "tape");

Stationary.getItems();
Stationary.deleteItem("eraser");

Stationary.getItems();




}
}