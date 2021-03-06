//Copyright (C) 2018 Cornell University

package jlang.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/** Run functional tests, using the JVM for reference. */
@RunWith(Parameterized.class)
public class TestFunctional {
    private static final File DIR = Paths.get("tests", "isolated").toFile();
    private static final int TIMEOUT = 600; // 10 minutes

    @Parameter
    @SuppressWarnings("all")
    public File file;

    @BeforeClass
    public static void setup() throws IOException, InterruptedException {
        TestUtil.make(DIR, TIMEOUT, "clean");
        TestUtil.make(DIR, TIMEOUT, "binary", "-k");
    }

    @Parameters(name = "{0}")
    public static Collection<File> getFiles() throws IOException {
        return TestUtil.collectFiles("java", DIR.toPath());
    }

    @Test
    public void testFile() throws IOException, InterruptedException {
        File solFile = TestUtil.changeExtension(file, "java", "sol");
        String solTarget = DIR.toPath().relativize(solFile.toPath()).toString();
        TestUtil.make(DIR, TIMEOUT, solTarget);

        File outFile = TestUtil.changeExtension(file, "java", "output");
        String outTarget = DIR.toPath().relativize(outFile.toPath()).toString();
        TestUtil.make(DIR, TIMEOUT, outTarget);

        assertEquals("Functional test gave incorrect output",
                     TestUtil.fileToString(solFile),
                     TestUtil.fileToString(outFile));
    }
}
