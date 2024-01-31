//package com.javarush.jira.bugtracking.attachment;
//
//import com.javarush.jira.common.error.IllegalRequestDataException;
//import org.junit.jupiter.api.Test;
//import org.springframework.mock.web.MockMultipartFile;
//import org.springframework.web.multipart.MultipartFile;
//
//import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//
//import java.io.File;
//import java.io.IOException;
//
//public class FileUtilTest {
//
//    @Test
//    public void testUpload() {
//        FileUtil fileUtil = new FileUtil();
//
//        MockMultipartFile multipartFile = new MockMultipartFile(
//                "file",
//                "test.txt",
//                "text/plain",
//                "Hello my test".getBytes()
//        );
//
//        String directoryPath = "./test-directory/";
//        String fileName = "test.txt";
//
//        assertDoesNotThrow(() -> fileUtil.upload(multipartFile, directoryPath, fileName)); //success
//
//        //emptyFile
//        MockMultipartFile emptyMultipartFile = new MockMultipartFile("emptyFile", new byte[0]);
//        assertThrows(IllegalRequestDataException.class, () ->
//                fileUtil.upload(emptyMultipartFile, directoryPath, fileName));
//
//        //error
//        MockMultipartFile ioExceptionMultipartFile = new MockMultipartFile(
//                "ioExceptionFile",
//                "ioExceptionFile.txt",
//                "text/plain",
//                "Hello, World!".getBytes()
//        ) {
//            @Override
//            public byte[] getBytes() throws IOException {
//                throw new IOException("Simulated IO Exception");
//            }
//        };
//
//        assertThrows(IllegalRequestDataException.class, () ->
//                fileUtil.upload(emptyMultipartFile, directoryPath, fileName));
//    }
//}
