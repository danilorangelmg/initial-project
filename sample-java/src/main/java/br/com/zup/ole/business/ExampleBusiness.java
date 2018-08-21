package br.com.zup.ole.business;

import br.com.zup.ole.model.ExampleModel;

public class ExampleBusiness {

	private ExampleModel example;
	
	public ExampleBusiness() {}
	
	public ExampleBusiness(ExampleModel example) {
		this.example = example;
	}
	
	public ExampleModel initExample() {
		example = new ExampleModel();
		example.setId("1");
		example.setName("Teste");
		return example;
	}
}
