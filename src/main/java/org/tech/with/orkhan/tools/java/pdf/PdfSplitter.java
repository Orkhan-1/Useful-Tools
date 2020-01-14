package org.tech.with.orkhan.tools.java.pdf;

import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.util.List;
import java.util.logging.Logger;

public class PdfSplitter {

    private final static Logger LOGGER = Logger.getLogger(PdfSplitter.class.getName());

    public static void main(String[] args) throws Exception {
        splitPdf("C:\\Desktop\\test.pdf", "C:\\Desktop\\test_page");
    }

    private static void splitPdf(String pdfDirectory, String saveDirectory) throws Exception {
        File file = new File(pdfDirectory);
        PDDocument document = PDDocument.load(file);
        Splitter splitter = new Splitter();
        List<PDDocument> pdfs = splitter.split(document);
        for (int i = 0; i < pdfs.size(); i++) {
            pdfs.get(i).save(saveDirectory + i + 1 + ".pdf");
        }
        LOGGER.info("Split successfully finished");
        document.close();
    }
}