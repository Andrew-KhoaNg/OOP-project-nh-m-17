package com.oop.blackjack.controller;

import com.oop.blackjack.model.Player;
import com.oop.blackjack.model.GameManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class BlackJackController {

    // Khai báo  UI từ 4
    // Các biến này phải có cùng fx:id trong file FXML

    @FXML private Button hitButton;
    @FXML private Button standButton;
    @FXML private Button dealButton;
    @FXML private Label bankLabel;
    @FXML private Label potLabel;
    @FXML private Label outcomeLabel;

    // Khai báo Container cho bài động
    @FXML private HBox playerCardContainer;
    @FXML private HBox dealerCardContainer;

    // --- KHAI BÁO CÁC ĐỐI TƯỢNG LOGIC (Của TV 2 & TV 3) ---

    private Player currentPlayer;
    private GameManager gameManager;

    // --- CÁC PHƯƠNG THỨC XỬ LÝ SỰ KIỆN ---

    // Phương thức này được gọi khi Controller được load (Của JavaFX)
    @FXML
    private void initialize() {
        // Khởi tạo các đối tượng logic ở đây
        // Ví dụ: gameManager = new GameManager();
        //         currentPlayer = new Player("Guest", 500);
    }

    @FXML
    public void handleDealClick() {
        // Nhiệm vụ 1: Lấy cược từ UI (TV 4)
        // Nhiệm vụ 2: Gọi gameManager.dealCards() (TV 2)
        // Nhiệm vụ 3: Cập nhật UI (TV 5)
    }

    @FXML
    public void handleHitClick() {
        // Gọi gameManager.playerHit() và kiểm tra Bust
    }

    @FXML
    public void handleStandClick() {
        // Gọi gameManager.dealerPlay() và gọi cashOut
    }

}