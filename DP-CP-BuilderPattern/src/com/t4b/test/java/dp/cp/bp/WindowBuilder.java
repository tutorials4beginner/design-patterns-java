package com.t4b.test.java.dp.cp.bp;

class WindowBuilder {

	public static MainWindow createWindow() {
		MainWindow window = new MainWindow();
		window.setMenu(new Menu());
		window.setToolBar(new ToolBar());
		return window;
	}
}
