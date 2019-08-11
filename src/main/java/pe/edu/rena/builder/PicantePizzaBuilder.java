package pe.edu.rena.builder;

//Concrete Builder
public class PicantePizzaBuilder extends PizzaBuilder {
	@Override
	public void buildMasa() {
		pizza.setMasa("suave");
	}

	@Override
	public void buildSalsa() {
		pizza.setSalsa("dulce");
	}

	@Override
	public void buildRelleno() {
		pizza.setRelleno("chorizo + alcachofas");
	}
}
