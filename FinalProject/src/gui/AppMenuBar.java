package gui;

import javafx.scene.control.*;
import config.*;

class AppMenuBar extends MenuBar {

	Menu file, help;

	MenuItem open, save, close;
	MenuItem about, using;

	public AppMenuBar() {

		super();
		init();
	}

	private void init() {

		LanguageConfig language = LanguageConfig.getInstance();

		file = new Menu(language.getFile());
		help = new Menu(language.getHelp());

		this.getMenus().addAll(file, help);

		open = new MenuItem(language.getOpen());
		save = new MenuItem(language.getSave());
		close = new MenuItem(language.getClose());

		file.getItems().addAll(open, new SeparatorMenuItem(), save, close);

		about = new MenuItem(language.getAbout());
		using = new MenuItem(language.getUsing());

		help.getItems().addAll(about, using);

	}
}