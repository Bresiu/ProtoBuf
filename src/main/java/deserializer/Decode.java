package deserializer;

import proto.generated.PolylineTest;

public class Decode {
	private final PolylineTest.Line line;

	public Decode() {
		System.out.println("decode");
		this.line = this.buildLine();
	}

	private PolylineTest.Point buildPointOne() {
		PolylineTest.Point.Builder point = PolylineTest.Point.newBuilder();
		point.setX(5);
		point.setY(3);
		point.setLabel("point 1");

		return point.build();
	}

	private PolylineTest.Point buildPointTwo() {
		PolylineTest.Point.Builder point = PolylineTest.Point.newBuilder();
		point.setX(10);
		point.setY(6);
		point.setLabel("point 2");

		return point.build();
	}

	private PolylineTest.Line buildLine() {
		PolylineTest.Line.Builder line = PolylineTest.Line.newBuilder();
		line.setStart(buildPointOne());
		line.setEnd(buildPointTwo());
		line.setLabel("line 1");

		return line.build();
	}

	public PolylineTest.Line getLine() {
		return line;
	}
}
