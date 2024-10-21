package diome.java.basico.aula03.poo;

public class Student implements StudentInterface {

	private String name;
	private int age;
	private Color color;
	private Sex sex;

	public Student() {

	}

	public Student(String name, int age, Color color, Sex sex) {
		this.name = name;
		this.age = age;
		this.color = color;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", color=" + color + ", sex=" + sex + "]";
	}
	
	@Override
	public void mostraInfo() {
		System.out.println( this.toString() );
	}

	@Override
	public void eating(Food food) {
		System.out.println( "Aluno " + this.getName() + " está Comendo : " + food.toString() );
	}

	@Override
	public void drinking(Eat eat) {
		System.out.println( "Aluno " + this.getName() + " está Bebendo : " +  eat.toString() );
	}

}
