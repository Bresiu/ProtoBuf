package serializer;

import deserializer.Decode;
import proto.generated.PolylineTest;

public class Encode {
	public Encode() {
		System.out.println("encode");
		Decode decode = new Decode();
		PolylineTest.Line line = decode.getLine();
		System.out.println(line.getLabel());
		System.out.println(line.toString());
		System.out.println(line.getStart());
		System.out.println(line.getEnd());
	}
}
