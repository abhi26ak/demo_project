package cds.gen.my.bookshop;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;

@CdsName("my.bookshop")
public interface Bookshop_ {
  String CDS_NAME = "my.bookshop";

  Class<Author_> AUTHOR = Author_.class;

  Class<Books_> BOOKS = Books_.class;
}
