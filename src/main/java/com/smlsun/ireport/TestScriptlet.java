package com.smlsun.ireport;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import net.sf.jasperreports.engine.JRDefaultScriptlet;
import net.sf.jasperreports.engine.JRScriptletException;

public class TestScriptlet extends JRDefaultScriptlet {
    public void afterDetailEval() throws JRScriptletException {
       this.setVariableValue("titleAddOrderid", "test Scriptlet ORDERID:"+getFieldValue("ORDERID").toString() );
    }
}