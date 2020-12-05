package org.tech.with.orkhan.tools.java.pdf;

import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;

public class PdfMerger {
    public static void main(String[] args) throws IOException {

        File file1 = new File("");
        PDDocument doc1 = PDDocument.load(file1);
        File file2 = new File("");
        PDDocument doc2 = PDDocument.load(file2);

        PDFMergerUtility merger = new PDFMergerUtility();
        merger.setDestinationFileName("");
        merger.addSource(file1);
        merger.addSource(file2);
        merger.mergeDocuments();
        System.out.println("Merge completed");

        doc1.close();
        doc2.close();
    }
}
