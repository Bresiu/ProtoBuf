package deserializer;

import proto.generated.PolylineTest;
import serializer.Encode;

public class Decode {
	private Encode encode;
	private PolylineTest.Line line;
	private PolylineTest.Polyline polyline;

	public Decode() {
		encode = new Encode();
		this.line = this.getLine();
		this.polyline = this.getPolyline();
		this.printPoints();
	}

	private void printPoints() {
		System.out.println(this.line.toString());
		if (this.line.hasLabel()) {
			System.out.println(this.line.getLabel());
		} else {
			System.out.println("LINE HAS NOT LABEL");
		}

		System.out.println(this.polyline.toString());
		if (this.polyline.hasLabel()) {
			System.out.println(this.polyline.getLabel());
		} else {
			System.out.println("POLYLINE HAS NOT LABEL");
		}

	}

	public PolylineTest.Line getLine() {
		return this.encode.getLine();
	}

	public PolylineTest.Polyline getPolyline() {
		return this.encode.getPolyline();
	}
}
