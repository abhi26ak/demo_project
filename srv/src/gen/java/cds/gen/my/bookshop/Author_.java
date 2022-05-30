package cds.gen.my.bookshop;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Integer;
import java.lang.String;

@CdsName("my.bookshop.author")
public interface Author_ extends StructuredType<Author_> {
  String CDS_NAME = "my.bookshop.author";

  ElementRef<Integer> ID();

  ElementRef<String> name();
}
