/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test.bibleApp;

import bibleApp.ReadFiles;
import java.io.File;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Nameyka
 */
public class ReadFilesTest {

    /**
     * Test of getFilesByName method, of class ReadFiles.
     */
    @Test
    public void testGetFilesByName() {
        System.out.println("getFilesByName");
        ReadFiles instance = new ReadFiles();
        int expResultLength = 66;
        File[] result = instance.getFilesByName();
        assertEquals(expResultLength, result.length);
    }
    /**
     * Test of getFile method, of class ReadFiles.
     */
    @Test
    public void testGetFile() throws Exception {
        System.out.println("getFile");
        String fileName = "1John.txt";
        ReadFiles instance = new ReadFiles();
        String expResult = "THE FIRST GENERAL EPISTLE OF JOHN";
        ArrayList<String> result = instance.getFile(fileName);
        System.out.println(expResult);
        System.out.println(result.get(0));
        assertEquals(expResult, result.get(0));
    } 
}