package testPackage01;

import org.testng.annotations.Test;

import com.shaft.cli.FileActions;
import com.shaft.validation.Assertions;
import com.shaft.validation.Assertions.AssertionComparisonType;
import com.shaft.validation.Assertions.AssertionType;

public class Test_FileActions {
    @Test
    public void f() {
	Assertions.assertEquals("", FileActions.listFilesInDirectory("/home/"), AssertionComparisonType.CONTAINS,
		AssertionType.POSITIVE);
    }
}
