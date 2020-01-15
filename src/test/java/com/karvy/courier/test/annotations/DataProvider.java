package com.karvy.courier.test.annotations;

public interface DataProvider {
	Class getDataType();

    Object[][] getObjects(MethodContext methodContext);
}
