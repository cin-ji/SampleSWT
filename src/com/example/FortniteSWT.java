package com.example;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class FortniteSWT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("lil bro");
		shell.setSize(900, 900);
		
		// set background image
		Image image = new Image(display, "src/images/img1.jpg");
		shell.setBackgroundImage(image);
		shell.setBackgroundMode(SWT.INHERIT_FORCE); // fit to page
		
		// create grid (2 rows)
		GridLayout layout = new GridLayout(2, true);
		layout.horizontalSpacing = 50;
		shell.setLayout(layout);
		
		// text
		Label label = new Label(shell, SWT.None);
		label.setText("Do you want to play Fortnite?");
		FontData[] fD = label.getFont().getFontData();
		fD[0].setHeight(20);
		fD[0].setStyle(SWT.BOLD);
		label.setFont(new Font(display, fD[0]));
		label.setForeground(new Color(display, 255, 255, 255));
		
		
		// button 1
		Button button1 = new Button(shell, SWT.PUSH);
		button1.setText("Yes");
		button1.setBackground(new Color(display, 0, 255, 0));
		
		// button 2
		Button button2 = new Button(shell, SWT.PUSH);
		button2.setText("Ok");
		button2.setBackground(new Color(display, 0, 255, 0));
		
		// align text
		GridData labelGridData = new GridData(SWT.CENTER, SWT.CENTER, true, true);
		labelGridData.horizontalAlignment = GridData.CENTER;
		labelGridData.verticalAlignment = GridData.CENTER;
		labelGridData.horizontalSpan = 2;
		label.setLayoutData(labelGridData);
		// align button 1
		GridData button1Data = new GridData(SWT.CENTER, SWT.CENTER, true, true);
		button1Data.widthHint = 100;
		button1Data.heightHint = 100;
		button1.setLayoutData(button1Data);
		// align button 2
		GridData button2Data = new GridData(SWT.CENTER, SWT.CENTER, true, true);
		button2Data.widthHint = 100;
		button2Data.heightHint = 100;
		button2.setLayoutData(button1Data);
		
		// run application
		shell.open();
		
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}
}
