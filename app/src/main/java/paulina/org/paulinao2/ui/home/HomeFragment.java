package paulina.org.paulinao2.ui.home;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

//import com.smarteist.autoimageslider.DefaultSliderView;
//import com.smarteist.autoimageslider.IndicatorAnimations;
//import com.smarteist.autoimageslider.SliderAnimations;
//import com.smarteist.autoimageslider.SliderLayout;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import paulina.org.paulinao2.R;


public class HomeFragment extends Fragment {

//    private SliderLayout sliderLayout;
    private SliderView sliderView;
    private ImageView map;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//         Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_home, container, false);
//        sliderLayout = view.findViewById(R.id.slider);
//        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
//        sliderLayout.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
//        sliderLayout.setScrollTimeInSec(1);
//




//        setSliderViews();

        map = view.findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMap();
            }
        });
        return view;
    }

    private void openMap() {
        Uri uri = Uri.parse("google.streetview:cbll=46.414382,10.013988");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.map");
        startActivity(intent);
    }

//    private void setSliderViews() {
//        for (int i =0; i<5; i++){
//            DefaultSliderView sliderView = new DefaultSliderView(getContext());
//
//            switch (i){
//                case 0:
//                    sliderView.setImageUrl("https://static.standard.co.uk/s3fs-public/thumbnails/image/2020/07/14/11/holidays-2020-should-you-stay-or-go.jpg?width=990&auto=webp&quality=75&crop=968%3A645%2Csmart");
////                    sliderView.setDescription("Hello");
//                    break;
//                case 1:
//                    sliderView.setImageUrl("https://static.standard.co.uk/s3fs-public/thumbnails/image/2020/07/14/11/holidays-2020-should-you-stay-or-go.jpg?width=990&auto=webp&quality=75&crop=968%3A645%2Csmart");
////                    sliderView.setDescription("Friends");
//                    break;
//                case 2:
//                    sliderView.setImageUrl("https://static.standard.co.uk/s3fs-public/thumbnails/image/2020/07/14/11/holidays-2020-should-you-stay-or-go.jpg?width=990&auto=webp&quality=75&crop=968%3A645%2Csmart");
////                    sliderView.setDescription("How");
//                    break;
//                case 3:
//                    sliderView.setImageUrl("https://static.standard.co.uk/s3fs-public/thumbnails/image/2020/07/14/11/holidays-2020-should-you-stay-or-go.jpg?width=990&auto=webp&quality=75&crop=968%3A645%2Csmart");
////                    sliderView.setDescription("are");
////                    break;
//                case 4:
//                    sliderView.setImageUrl("https://static.standard.co.uk/s3fs-public/thumbnails/image/2020/07/14/11/holidays-2020-should-you-stay-or-go.jpg?width=990&auto=webp&quality=75&crop=968%3A645%2Csmart");
////                    sliderView.setDescription("you?");
//                    break;
//            }
//            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
//            sliderLayout.addSliderView(sliderView);
//        }
//    }
}