package kontroleri;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.List;

public class KontrolerFormeZaPopisivanjeStanovnika {
    @FXML
    private ComboBox odabirPolaComboBox;
    @FXML
    private RadioButton pitanje2Button1;
    @FXML
    private RadioButton pitanje2Button2;
    @FXML
    private ComboBox razlogOdsustvaPrisustvaComboBox;
    @FXML
    private RadioButton pitanje4Button1;
    @FXML
    private RadioButton pitanje4Button2;
    @FXML
    private TextField pitanje4TextField1;
    @FXML
    private TextField pitanje4TextField2;
    @FXML
    private RadioButton pitanje5Button1;
    @FXML
    private RadioButton pitanje5Button2;
    @FXML
    private TextField pitanje5TextField2;
    @FXML
    private RadioButton pitanje6Button1;
    @FXML
    private RadioButton pitanje6Button2;
    @FXML
    private TextField pitanje6TextField1;
    @FXML
    private TextField pitanje6TextField2;
    @FXML
    private TextField pitanje6TextField3;
    @FXML
    private RadioButton pitanje7Button1;
    @FXML
    private RadioButton pitanje7Button2;
    @FXML
    private RadioButton pitanje8Button1;
    @FXML
    private RadioButton pitanje8Button2;
    @FXML
    private TextField pitanje8TextField1;
    @FXML
    private TextField pitanje8TextField2;
    @FXML
    private TextField pitanje8TextField3;
    @FXML
    private RadioButton pitanje9Button1;
    @FXML
    private RadioButton pitanje9Button2;
    @FXML
    private TextField pitanje9TextField1;
    @FXML
    private TextField pitanje9TextField3;
    @FXML
    private TextField pitanje9TextField2;
    @FXML
    private RadioButton pitanje10Button1;
    @FXML
    private RadioButton pitanje10Button2;
    @FXML
    private RadioButton pitanje11Button1;
    @FXML
    private RadioButton pitanje11Button2;
    @FXML
    private TextField pitanje11TextField1;
    @FXML
    private TextField pitanje11TextField2;
    @FXML
    private TextField pitanje11TextField3;
    @FXML
    private DatePicker pitanje11DatePicker;
    @FXML
    private TextField pitanje12TextField;
    @FXML
    private ComboBox pitanje12ComboBox;
    @FXML
    private TextField pitanje13TextField1;
    @FXML
    private TextField pitanje13TextField2;
    @FXML
    private TextField pitanje13TextField3;
    @FXML
    private RadioButton pitanje14Button1;
    @FXML
    private RadioButton pitanje14Button2;
    @FXML
    private RadioButton pitanje15Button1;
    @FXML
    private RadioButton pitanje15Button2;
    @FXML
    private RadioButton pitanje15Button3;
    @FXML
    private RadioButton pitanje16Button1;
    @FXML
    private TextField pitanje16TextField2;
    @FXML
    private TextField pitanje16TextField1;
    @FXML
    private RadioButton pitanje16Button2;
    @FXML
    private RadioButton pitanje17Button1;
    @FXML
    private RadioButton pitanje17Button2;
    @FXML
    private RadioButton pitanje18Button1;
    @FXML
    private RadioButton pitanje18Button2;
    @FXML
    private RadioButton pitanje19Button1;
    @FXML
    private RadioButton pitanje19Button2;
    @FXML
    private RadioButton pitanje19Button3;
    @FXML
    private RadioButton pitanje19Button4;
    @FXML
    private TextField pitanje19TextField;
    @FXML
    private TextField pitanje25TextField;
    @FXML
    private TextField pitanje26TextField;
    @FXML
    private TextField pitanje27TextField;
    @FXML
    private TextField pitanje29TextField1;
    @FXML
    private TextField pitanje29TextField2;
    @FXML
    private TextField pitanje30TextField;
    @FXML
    private RadioButton pitanje31Button1;
    @FXML
    private RadioButton pitanje31Button2;
    @FXML
    private RadioButton pitanje34Button1;
    @FXML
    private RadioButton pitanje34Button2;
    @FXML
    private RadioButton pitanje34Button3;
    @FXML
    private RadioButton pitanje35Button1;
    @FXML
    private RadioButton pitanje35Button2;
    @FXML
    private RadioButton pitanje37Button1;
    @FXML
    private RadioButton pitanje37Button2;
    @FXML
    private TextField pitanje39TextField;
    @FXML
    private TextField pitanje40TextField1;
    @FXML
    private TextField pitanje40TextField2;
    @FXML
    private RadioButton pitanje41Button1;
    @FXML
    private RadioButton pitanje41Button2;
    @FXML
    private TextField pitanje41TextField1;
    @FXML
    private TextField pitanje41TextField2;
    @FXML
    private TextField pitanje41TextField3;
    @FXML
    private RadioButton pitanje13Button2;
    @FXML
    private RadioButton pitanje13Button3;
    @FXML
    private RadioButton pitanje13Button1;
    @FXML
    private DatePicker pitanje12DatePicker;
    @FXML
    private ComboBox vidStepenComboBox;
    @FXML
    private ComboBox hodStepenComboBox;
    @FXML
    private ComboBox sluhStepenComboBox;
    @FXML
    private ComboBox pamcenjeStepenComboBox;
    @FXML
    private ComboBox odijevanjeStepenComboBox;
    @FXML
    private ComboBox komunikacijaStepenComboBox;
    @FXML
    private ComboBox vidUzrokComboBox;
    @FXML
    private ComboBox sluhUzrokComboBox;
    @FXML
    private ComboBox hodUzrokComboBox;
    @FXML
    private ComboBox pamcenjeUzrokComboBox;
    @FXML
    private ComboBox odijevanjeUzrokComboBox;
    @FXML
    private ComboBox komunikacijaUzrokComboBox;
    @FXML
    private ToggleGroup grupa1;
    @FXML
    private ToggleGroup grupa11;
    @FXML
    private ToggleGroup grupa22;
    @FXML
    private ToggleGroup grupa23;
    @FXML
    private ToggleGroup grupa24;
    @FXML
    private ToggleGroup grupa25;
    @FXML
    private ToggleGroup grupa26;
    @FXML
    private ToggleGroup grupa27;
    @FXML
    private ToggleGroup grupa28;
    @FXML
    private ToggleGroup grupa31;
    @FXML
    private ToggleGroup grupa32;
    @FXML
    private ToggleGroup grupa33;
    @FXML
    private ToggleGroup grupa34;
    @FXML
    private ToggleGroup grupa35;
    @FXML
    private ToggleGroup grupa36;
    @FXML
    private ToggleGroup grupa38;
    @FXML
    private ToggleGroup grupa39;

    public KontrolerFormeZaPopisivanjeStanovnika(){
        KontrolerFormeZaRadPopisivaca.popisStanovnikaStage.setOnShowing((event) -> inicijalizujKomponente());
    }

    private void inicijalizujKomponente(){
        List<String> listaPolova = new ArrayList<>();
        listaPolova.add("Ženski");
        listaPolova.add("Muški");
        ObservableList observableList = FXCollections.observableList(listaPolova);
        odabirPolaComboBox.setItems(observableList);

        List<String> listaRazloga = new ArrayList<>();
        listaRazloga.add("1: Rad");
        listaRazloga.add("2: Školovanje");
        listaRazloga.add("3: Porodični razlozi");
        listaRazloga.add("4: Ostali razlozi");
        listaRazloga.add("5: Na radu u inostranstvu kod stranog ili domaćeg poslodavca ili na samostalnom radu");
        listaRazloga.add("6: Upućeno na rad u diplomatsko - konzularna i druga predstavništva, međunarodne organizacije i sl.");
        listaRazloga.add("7: Boravak u inostranstvu kao član domaćinstva lica odsutnog iz razloga 5");
        listaRazloga.add("8: Boravak u inostranstvu kao član domaćinstva lica odsutnog iz razloga 6");
        listaRazloga.add("9: Školovanje u inostranstvu");
        listaRazloga.add("10: Ostali razlozi boravka u inostranstvu");
        ObservableList observableList1 = FXCollections.observableList(listaRazloga);
        razlogOdsustvaPrisustvaComboBox.setItems(observableList1);

        List<String> listaRazlogaDoseljenja = new ArrayList<>();
        listaRazlogaDoseljenja.add("Posao");
        listaRazlogaDoseljenja.add("Školovanje");
        listaRazlogaDoseljenja.add("Porodični razlozi");
        listaRazlogaDoseljenja.add("Prinudni razlozi");
        listaRazlogaDoseljenja.add("Ostali");
        ObservableList observableList2 = FXCollections.observableList(listaRazlogaDoseljenja);
        pitanje12ComboBox.setItems(observableList2);

        grupa1.getToggles().forEach(toggle -> {
            RadioButton button = (RadioButton)toggle;
            button.setOnAction((event) -> {
                if(button.getText().equals("Član domaćinstva koji živi u mjestu popisa godinu " +
                        "dana ili duže ili se doselio sa namjerom da tu živi")){
                    pitanje2Button1.setDisable(false);
                    pitanje2Button2.setDisable(false);
                }
                else {
                    pitanje2Button1.setDisable(true);
                    pitanje2Button2.setDisable(true);
                }
            });
        });

        pitanje2Button1.setOnAction((event) -> {
            razlogOdsustvaPrisustvaComboBox.setDisable(true);
            pitanje4Button1.setDisable(true);
            pitanje4Button2.setDisable(true);
            pitanje4TextField1.setDisable(true);
            pitanje4TextField2.setDisable(true);
            pitanje5Button1.setDisable(true);
            pitanje5Button2.setDisable(true);
            pitanje5TextField2.setDisable(true);
            pitanje6Button1.setDisable(true);
            pitanje6Button2.setDisable(true);
            pitanje6TextField1.setDisable(true);
            pitanje6TextField2.setDisable(true);
            pitanje6TextField3.setDisable(true);
            pitanje7Button1.setDisable(true);
            pitanje7Button2.setDisable(true);
        });
        pitanje2Button2.setOnAction((event) -> {
            razlogOdsustvaPrisustvaComboBox.setDisable(false);
            pitanje4Button1.setDisable(false);
            pitanje4Button2.setDisable(false);
            pitanje4TextField1.setDisable(false);
            pitanje4TextField2.setDisable(false);
            pitanje5Button1.setDisable(false);
            pitanje5Button2.setDisable(false);
            pitanje5TextField2.setDisable(false);
            pitanje6Button1.setDisable(false);
            pitanje6Button2.setDisable(false);
            pitanje6TextField1.setDisable(false);
            pitanje6TextField2.setDisable(false);
            pitanje6TextField3.setDisable(false);
            pitanje7Button1.setDisable(false);
            pitanje7Button2.setDisable(false);
        });

        pitanje4Button1.setOnAction((event) -> {
            pitanje4TextField2.clear();
            pitanje4TextField2.setDisable(true);
            pitanje4TextField1.setDisable(false);
            pitanje5Button1.setDisable(true);
            pitanje5Button2.setDisable(true);
            pitanje5TextField2.setDisable(true);
        });
        pitanje4Button2.setOnAction((event) -> {
            pitanje4TextField1.clear();
            pitanje4TextField1.setDisable(true);
            pitanje4TextField2.setDisable(false);
            pitanje5Button1.setDisable(false);
            pitanje5Button2.setDisable(false);
            pitanje5TextField2.setDisable(false);
        });

        pitanje5Button1.setOnAction((event) -> {
            pitanje5TextField2.clear();
            pitanje5TextField2.setDisable(true);
        });
        pitanje5Button2.setOnAction((event) -> pitanje5TextField2.setDisable(false));

        pitanje6Button1.setOnAction((event) -> {
            pitanje6TextField3.clear();
            pitanje6TextField3.setDisable(true);
            pitanje6TextField1.setDisable(false);
            pitanje6TextField2.setDisable(false);
        });
        pitanje6Button2.setOnAction((event) -> {
            pitanje6TextField1.clear();
            pitanje6TextField1.setDisable(true);
            pitanje6TextField2.clear();
            pitanje6TextField2.setDisable(true);
            pitanje6TextField3.setDisable(false);
        });

        pitanje8Button1.setOnAction((event) -> {
            pitanje8TextField3.clear();
            pitanje8TextField3.setDisable(true);
            pitanje8TextField1.setDisable(false);
            pitanje8TextField2.setDisable(false);
        });
        pitanje8Button2.setOnAction((event) -> {
            pitanje8TextField1.clear();
            pitanje8TextField1.setDisable(true);
            pitanje8TextField2.clear();
            pitanje8TextField2.setDisable(true);
            pitanje8TextField3.setDisable(false);
        });

        pitanje9Button1.setOnAction((event) -> {
            pitanje9TextField3.clear();
            pitanje9TextField3.setDisable(true);
            pitanje9TextField1.setDisable(false);
            pitanje9TextField2.setDisable(false);
        });
        pitanje9Button2.setOnAction((event) -> {
            pitanje9TextField1.clear();
            pitanje9TextField1.setDisable(true);
            pitanje9TextField2.clear();
            pitanje9TextField2.setDisable(true);
            pitanje9TextField3.setDisable(false);
        });

        pitanje10Button1.setOnAction((event) -> {
            pitanje11Button1.setDisable(false);
            pitanje11Button2.setDisable(false);
            pitanje11TextField1.setDisable(false);
            pitanje11TextField2.setDisable(false);
            pitanje11TextField3.setDisable(false);
            pitanje11DatePicker.setDisable(false);
        });
        pitanje10Button2.setOnAction((event) -> {
            pitanje11Button1.setDisable(true);
            pitanje11Button2.setDisable(true);
            pitanje11TextField1.setDisable(true);
            pitanje11TextField2.setDisable(true);
            pitanje11TextField3.setDisable(true);
            pitanje11DatePicker.setDisable(true);
        });

        pitanje11Button1.setOnAction((event) -> {
            pitanje11TextField3.clear();
            pitanje11TextField3.setDisable(true);
            pitanje11TextField1.setDisable(false);
            pitanje11TextField2.setDisable(false);
            pitanje11DatePicker.setValue(null);
            pitanje11DatePicker.setDisable(true);
        });
        pitanje11Button2.setOnAction((event) -> {
            pitanje11TextField1.clear();
            pitanje11TextField1.setDisable(true);
            pitanje11TextField2.clear();
            pitanje11TextField2.setDisable(true);
            pitanje11TextField3.setDisable(false);
            pitanje11DatePicker.setDisable(false);
        });

        grupa11.getToggles().forEach(toggle -> {
            RadioButton button = (RadioButton)toggle;
            button.setOnAction((event) -> {
                if(button.getText().equals("Da (država u kojoj je lice živjelo):")){
                    pitanje12TextField.setDisable(false);
                    pitanje12ComboBox.setDisable(false);
                    pitanje12DatePicker.setDisable(false);
                }
                else {
                    pitanje12TextField.clear();
                    pitanje12TextField.setDisable(true);
                    pitanje12ComboBox.setDisable(true);
                    pitanje12DatePicker.setValue(null);
                    pitanje12DatePicker.setDisable(true);
                }
            });
        });

        pitanje13Button1.setOnAction((event) -> {
            pitanje13TextField1.clear();
            pitanje13TextField1.setDisable(true);
            pitanje13TextField2.clear();
            pitanje13TextField2.setDisable(true);
            pitanje13TextField3.clear();
            pitanje13TextField3.setDisable(true);
        });
        pitanje13Button2.setOnAction((event) -> {
            pitanje13TextField1.setDisable(false);
            pitanje13TextField2.setDisable(false);
            pitanje13TextField3.clear();
            pitanje13TextField3.setDisable(true);
        });
        pitanje13Button3.setOnAction((event) -> {
            pitanje13TextField3.setDisable(false);
            pitanje13TextField1.clear();
            pitanje13TextField1.setDisable(true);
            pitanje13TextField2.clear();
            pitanje13TextField2.setDisable(true);
        });

        pitanje14Button1.setOnAction((event) -> {
            pitanje15Button1.setDisable(false);
            pitanje15Button2.setDisable(false);
            pitanje15Button3.setDisable(false);
        });
        pitanje14Button2.setOnAction((event) -> {
            pitanje15Button1.setDisable(true);
            pitanje15Button2.setDisable(true);
            pitanje15Button3.setDisable(true);
        });

        pitanje16Button1.setOnAction((event) -> {
            pitanje16TextField1.setDisable(false);
            pitanje16TextField2.setDisable(false);
            pitanje17Button1.setDisable(false);
            pitanje17Button2.setDisable(false);
            pitanje18Button1.setDisable(false);
            pitanje18Button2.setDisable(false);
        });
        pitanje16Button2.setOnAction((event) -> {
            pitanje16TextField1.clear();
            pitanje16TextField1.setDisable(true);
            pitanje16TextField2.clear();
            pitanje16TextField2.setDisable(true);
            pitanje17Button1.setDisable(true);
            pitanje17Button2.setDisable(true);
            pitanje18Button1.setDisable(true);
            pitanje18Button2.setDisable(true);
        });

        pitanje17Button1.setOnAction((event) -> {
            pitanje18Button1.setDisable(true);
            pitanje18Button2.setDisable(true);
        });
        pitanje17Button2.setOnAction((event) -> {
            pitanje18Button1.setDisable(false);
            pitanje18Button2.setDisable(false);
        });

        pitanje19Button1.setOnAction((event) -> {
            pitanje19TextField.clear();
            pitanje19TextField.setDisable(true);
        });
        pitanje19Button2.setOnAction((event) -> pitanje19TextField.setDisable(false));
        pitanje19Button3.setOnAction((event) -> pitanje19TextField.setDisable(false));
        pitanje19Button4.setOnAction((event) -> {
            pitanje19TextField.clear();
            pitanje19TextField.setDisable(true);
        });

        grupa22.getToggles().forEach(toggle -> {
            RadioButton button = (RadioButton)toggle;
            button.setOnAction((event) -> {
                if(button.getText().equals("Drugo:"))
                    pitanje25TextField.setDisable(false);
                else {
                    pitanje25TextField.clear();
                    pitanje25TextField.setDisable(true);
                }
            });
        });

        grupa23.getToggles().forEach(toggle -> {
            RadioButton button = (RadioButton)toggle;
            button.setOnAction((event) -> {
                if(button.getText().equals("Drugo:"))
                    pitanje26TextField.setDisable(false);
                else {
                    pitanje26TextField.clear();
                    pitanje26TextField.setDisable(true);
                }
            });
        });

        grupa24.getToggles().forEach(toggle -> {
            RadioButton button = (RadioButton)toggle;
            button.setOnAction((event) -> {
                if(button.getText().equals("Drugo:"))
                    pitanje27TextField.setDisable(false);
                else {
                    pitanje27TextField.clear();
                    pitanje27TextField.setDisable(true);
                }
            });
        });

        grupa25.getToggles().forEach(toggle -> {
            RadioButton button = (RadioButton)toggle;
            button.setOnAction((event) -> {
                if(!button.getText().equals("Visoka škola/fakultet/akademija/univerzitet")){
                    if(button.getText().equals("Nepotpuno osnovno obrazovanje (upisati najviši razred koji je lice završilo)")){
                        pitanje29TextField1.setDisable(false);
                        pitanje29TextField2.setDisable(false);
                        pitanje31Button1.setDisable(false);
                        pitanje31Button2.setDisable(false);
                    }
                    else
                    {
                        if(button.getText().equals("Bez ikakvog obrazovanja")){
                            pitanje31Button1.setDisable(false);
                            pitanje31Button2.setDisable(false);
                        }
                        else{
                            pitanje31Button1.setDisable(true);
                            pitanje31Button2.setDisable(true);
                        }
                        pitanje29TextField1.clear();
                        pitanje29TextField1.setDisable(true);
                        pitanje29TextField2.clear();
                        pitanje29TextField2.setDisable(true);
                    }
                    grupa28.getToggles().forEach(toggle1 -> {
                        Node node = (Node) toggle1 ;
                        node.setDisable(true);
                    });
                    pitanje30TextField.setDisable(true);
                }
                else {
                    pitanje29TextField1.clear();
                    pitanje29TextField1.setDisable(true);
                    pitanje29TextField2.clear();
                    pitanje29TextField2.setDisable(true);
                    grupa28.getToggles().forEach(toggle1 -> {
                        Node node = (Node) toggle1 ;
                        node.setDisable(false);
                    });
                    pitanje30TextField.setDisable(false);
                    pitanje31Button1.setDisable(false);
                    pitanje31Button2.setDisable(false);
                }
                if(button.getText().equals("Srednja škola")){
                    grupa26.getToggles().forEach(toggle1 -> {
                        Node node = (Node) toggle1 ;
                        node.setDisable(false);
                    });
                    grupa27.getToggles().forEach(toggle1 -> {
                        Node node = (Node) toggle1 ;
                        node.setDisable(false);
                    });
                }
                else{
                    grupa26.getToggles().forEach(toggle2 -> {
                        Node node = (Node) toggle2 ;
                        node.setDisable(true);
                    });
                    grupa27.getToggles().forEach(toggle2 -> {
                        Node node = (Node) toggle2 ;
                        node.setDisable(true);
                    });
                }
            });
        });

        grupa28.getToggles().forEach(toggle -> {
            RadioButton button = (RadioButton)toggle;
            button.setOnAction((event) -> {
                if(button.getText().equals("Diplomirani (broj godina studija):"))
                    pitanje30TextField.setDisable(false);
                else {
                    pitanje30TextField.clear();
                    pitanje30TextField.setDisable(true);
                }
                pitanje31Button1.setDisable(true);
                pitanje31Button2.setDisable(true);
            });
        });

        grupa31.getToggles().forEach(toggle1 -> {
            RadioButton button = (RadioButton)toggle1;
            button.setOnAction((event) -> {
                grupa32.getToggles().forEach(toggle -> {
                Node node = (Node) toggle ;
                if(!button.getText().equals("Ne"))
                    node.setDisable(true);
                else
                    node.setDisable(false);
                });
                grupa33.getToggles().forEach(toggle -> {
                    Node node = (Node) toggle ;
                    if(!button.getText().equals("Ne"))
                        node.setDisable(true);
                    else
                        node.setDisable(false);
                });
                grupa34.getToggles().forEach(toggle -> {
                    Node node = (Node) toggle ;
                    if(!button.getText().equals("Ne"))
                        node.setDisable(true);
                    else
                        node.setDisable(false);
                });
                grupa35.getToggles().forEach(toggle -> {
                    Node node = (Node) toggle ;
                    if(!button.getText().equals("Ne"))
                        node.setDisable(true);
                    else
                        node.setDisable(false);
                });
            });
        });

        grupa32.getToggles().forEach(toggle1 -> {
            RadioButton button = (RadioButton)toggle1;
            button.setOnAction((event) -> {
                grupa33.getToggles().forEach(toggle -> {
                    Node node = (Node) toggle ;
                    if(!button.getText().equals("Ne"))
                        node.setDisable(false);
                    else
                        node.setDisable(true);
                });
            });
        });

        pitanje35Button1.setOnAction((event) -> grupa34.getToggles().forEach(toggle -> {
            Node node = (Node) toggle ;
            node.setDisable(true);
        }));
        pitanje35Button2.setOnAction((event) -> grupa34.getToggles().forEach(toggle -> {
            Node node = (Node) toggle ;
            node.setDisable(false);
        }));

        grupa34.getToggles().forEach(toggle -> {
            RadioButton button = (RadioButton)toggle;
            button.setOnAction((event) -> {
                grupa35.getToggles().forEach(toggle1 -> {
                    Node node = (Node) toggle1;
                    node.setDisable(true);
                });
                grupa36.getToggles().forEach(toggle1 -> {
                    Node node = (Node) toggle1;
                    node.setDisable(true);
                });
                pitanje39TextField.setDisable(true);
                pitanje40TextField1.setDisable(true);
                pitanje40TextField2.setDisable(true);
            });
        });

        pitanje37Button1.setOnAction((event) -> {
            grupa36.getToggles().forEach(toggle1 -> {
                Node node = (Node) toggle1;
                node.setDisable(false);
            });
            pitanje39TextField.setDisable(false);
            pitanje40TextField1.setDisable(false);
            pitanje40TextField2.setDisable(false);
        });
        pitanje37Button2.setOnAction((event) -> {
            grupa36.getToggles().forEach(toggle1 -> {
                Node node = (Node) toggle1;
                node.setDisable(true);
            });
            pitanje39TextField.setDisable(true);
            pitanje40TextField1.setDisable(true);
            pitanje40TextField2.setDisable(true);
        });

        pitanje41Button1.setOnAction((event) -> {
            pitanje41TextField3.clear();
            pitanje41TextField3.setDisable(true);
            pitanje41TextField1.setDisable(false);
            pitanje41TextField2.setDisable(false);
        });
        pitanje41Button2.setOnAction((event) -> {
            pitanje41TextField1.clear();
            pitanje41TextField1.setDisable(true);
            pitanje41TextField2.clear();
            pitanje41TextField2.setDisable(true);
            pitanje41TextField3.setDisable(false);
        });

        grupa38.getToggles().forEach(toggle -> {
            RadioButton button = (RadioButton)toggle;
            button.setOnAction((event) -> {
                grupa39.getToggles().forEach(toggle1 -> {
                    Node node = (Node) toggle1;
                    if(!button.getText().equals("Izdržavano lice"))
                        node.setDisable(true);
                    else
                        node.setDisable(false);
                });
            });
        });

        List<String> stepeniPoteskoce = new ArrayList<>();
        stepeniPoteskoce.add("Nema poteškoća");
        stepeniPoteskoce.add("Ima, manje");
        stepeniPoteskoce.add("Ima, veće");
        stepeniPoteskoce.add("Potpuna nesposobnost");
        ObservableList observableList3 = FXCollections.observableList(stepeniPoteskoce);
        vidStepenComboBox.setItems(observableList3);
        sluhStepenComboBox.setItems(observableList3);
        hodStepenComboBox.setItems(observableList3);
        pamcenjeStepenComboBox.setItems(observableList3);
        odijevanjeStepenComboBox.setItems(observableList3);
        komunikacijaStepenComboBox.setItems(observableList3);

        List<String> uzrociPoteskoce = new ArrayList<>();
        uzrociPoteskoce.add("Urođena");
        uzrociPoteskoce.add("Povreda pri porodu");
        uzrociPoteskoce.add("Bolest");
        uzrociPoteskoce.add("Povreda na radu");
        uzrociPoteskoce.add("Saobraćajna nesreća");
        uzrociPoteskoce.add("Posljedica rata");
        uzrociPoteskoce.add("Ostalo");
        ObservableList observableList4 = FXCollections.observableList(uzrociPoteskoce);
        vidUzrokComboBox.setItems(observableList4);
        sluhUzrokComboBox.setItems(observableList4);
        hodUzrokComboBox.setItems(observableList4);
        pamcenjeUzrokComboBox.setItems(observableList4);
        odijevanjeUzrokComboBox.setItems(observableList4);
        komunikacijaUzrokComboBox.setItems(observableList4);
    }

    @FXML
    public void posaljiPopisnicuButtonAction() {

    }
}
