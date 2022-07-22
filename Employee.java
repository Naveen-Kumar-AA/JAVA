class Employee{
    String name;
    int salary;
    Employee(String n, int sal){
        name = n;
        salary = sal;
        System.out.println("I'm "+name+"\nMy salary is "+salary);
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
}