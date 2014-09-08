package deserializer;

import proto.generated.PolylineTest;
import serializer.Encode;

public class Decode {
	private PolylineTest.Line line;

	public Decode() {
		this.line = this.getLine();
		this.printPoints();
	}

	private void printPoints() {
		System.out.println(this.line.toString());
		if(this.line.hasLabel()) {
			System.out.println(this.line.getLabel());
		}

	}

	public PolylineTest.Line getLine() {
		return new Encode().getLine();
	}
}
