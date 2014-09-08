package deserializer;

import proto.generated.PolylineTest;
import serializer.Encode;

public class Decode {
	private PolylineTest.Line line;

	public Decode() {
		System.out.println("encode");
		this.line = this.getLine();
		this.printPoints();
	}

	private void printPoints() {
		System.out.println(this.line.getLabel());
		System.out.println(this.line.toString());
		System.out.println(this.line.getStart());
		System.out.println(this.line.getEnd());
	}

	public PolylineTest.Line getLine() {
		return new Encode().getLine();
	}
}
