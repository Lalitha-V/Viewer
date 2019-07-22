//package com.example.viewmodel;
//
//import android.view.View;
//import androidx.databinding.ObservableInt;
//import androidx.lifecycle.MutableLiveData;
//import androidx.lifecycle.ViewModel;
//import com.example.ItemListActivity;
//import com.example.models.Character;
//import com.example.models.CharactersResponse;
//
//import java.util.List;
//
//import static com.example.ItemListActivity.*;
//
//public class ItemListViewModel extends ViewModel {
//
//    private CharactersResponse charactersResponse;
//    private SimpleItemRecyclerViewAdapter adapter;
//    public MutableLiveData<Character> selected;
//    public ObservableInt loading;
//    public ObservableInt showEmpty;
//
//    public void init() {
//        charactersResponse = new CharactersResponse();
//        selected = new MutableLiveData<>();
//        adapter = new SimpleItemRecyclerViewAdapter(R.layout.view_definition, this);
//        loading = new ObservableInt(View.GONE);
//        showEmpty = new ObservableInt(View.GONE);
//    }
//
//    public void fetchList(String term) {
//        charactersResponse.fetchList(term);
//    }
//
//    public MutableLiveData<List<Character>> getCharactersResponse() {
//        return charactersResponse.getCharacters();
//    }
//
//    public SimpleItemRecyclerViewAdapter getAdapter() {
//        return adapter;
//    }
//
//    public void setDefinitionsInAdapter(List<Character> definitionList) {
//        this.adapter.(definitionList);
//        this.adapter.notifyDataSetChanged();
//    }
//
//    public MutableLiveData<Character> getSelected() {
//        return selected;
//    }
//
//    public void onItemClick(Integer index) {
//        Character db = getCharacterAt(index);
//        selected.setValue(db);
//    }
//
//    public Character getCharacterAt(Integer index) {
//        if (charactersResponse.getCharacters().getValue() != null &&
//                index != null &&
//                charactersResponse.getCharacters().getValue().size() > index) {
//            return charactersResponse.getCharacters().getValue().get(index);
//        }
//        return null;
//    }
//
//
//
//
//}
