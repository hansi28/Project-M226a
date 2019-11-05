public class vehicleList {
  String name;
  String brand;
  String color;
  String owner;
  int year;
  int month;
  int day;
  String sign;
  String doors;
  String number;
  int price;

  public vehicleList(String name, String brand, String color, String owner, int year, int month, int day, String sign, String doors, String number, int price) {
    this.name = name;
    this.brand = brand;
    this.color = color;
    this.owner = owner;
    this.year = year;
    this.month = month;
    this.day = day;
    this.sign = sign;
    this.doors = doors;
    this.number = number;
    this.price = price;
  }

  public String toString() {
    return new String(name + ";" + brand + ";" + color + ";" + owner + ";" + day + "." + month + "." + year + ";" + sign + ";" + doors + ";" + number + ";" + price);
  }


}