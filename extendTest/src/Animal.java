class Animal {
    int age;
    int weight;

    public Animal(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void run() {
        System.out.println("run " + age);
    }

    public void eat() {
        System.out.println("eat " + weight);
    }
}