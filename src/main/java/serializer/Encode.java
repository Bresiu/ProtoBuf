package serializer;

import proto.generated.PolylineTest;

public class Encode {
	private final PolylineTest.Line line;
	private final PolylineTest.Polyline polyline;

	public Encode() {
		this.line = this.buildLine();
		this.polyline = this.buildPolyline();
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
		line.setStart(this.buildPointOne());
		line.setEnd(this.buildPointTwo());
		line.setLabel("line 1");

		return line.build();
	}

	private PolylineTest.Polyline buildPolyline() {
		PolylineTest.Polyline.Builder polyline = PolylineTest.Polyline.newBuilder();
		polyline.addPoint(buildPointOne());
		polyline.addPoint(buildPointTwo());
		polyline.addPoint(buildPointOne());
		polyline.addPoint(buildPointTwo());

		return polyline.build();
	}

	public PolylineTest.Line getLine() {
		return this.line;
	}

	public PolylineTest.Polyline getPolyline() {
		return this.polyline;
	}
}
