package milkman.ui.main;

import javax.inject.Inject;
import javax.inject.Singleton;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import milkman.domain.RequestContainer;
import milkman.domain.ResponseContainer;
import milkman.utils.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;

@Singleton
@RequiredArgsConstructor(onConstructor_={@Inject})
public class WorkingAreaComponent {

	private final RequestComponent restRequestComponent;
	private final ResponseComponent responseComponent;
	@FXML ToolBar openedTabsBar;

	
	public void display(RequestContainer activeRequest) {
		openedTabsBar.getItems().clear();
		openedTabsBar.getItems().add(new Button(activeRequest.getName()));
		restRequestComponent.display(activeRequest);
	}
	
	public void display(ResponseContainer activeResponse) {
		responseComponent.display(activeResponse);
	}
	
}
