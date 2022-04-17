package com.example.itfest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.location.FilteringMode;
import com.yandex.mapkit.location.Location;
import com.yandex.mapkit.location.LocationListener;
import com.yandex.mapkit.location.LocationManager;
import com.yandex.mapkit.location.LocationStatus;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.InputListener;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.MapObjectTapListener;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.map.PolylineMapObject;
import com.yandex.mapkit.mapview.MapView;
import com.yandex.runtime.image.AnimatedImageProvider;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.ui_view.ViewProvider;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    private MapView mapview;

    private final Point one = new Point(45.918249, 6.866327);
    private final Point two = new Point(46.497000, 9.838133);
    private final Point three = new Point(44.279199, -73.980692);
    private final Point four = new Point(47.498400, 11.100536);
    private final Point five = new Point(46.497000, 9.838133);
    private final Point six = new Point(59.912756, 10.734374);
    private final Point seven = new Point(46.535139, 12.138189);
    private final Point eight = new Point(36.740598, -119.245389);
    private final Point nine = new Point(47.257623, 11.404184);
    private final Point ten = new Point(45.188240, 5.719124);
    private final Point eleven = new Point(43.058866, 141.339849);
    private final Point twelve = new Point(47.257623, 11.404184);
    private final Point threeteen = new Point(44.279199, -73.980692);
    private final Point fourteen = new Point(43.851241, 18.360981);
    private final Point fifteen = new Point(51.034096, -114.083912);
    private final Point sixteen = new Point(45.670217, 6.392142);
    private final Point seventeen = new Point(61.120689, 10.459229);
    private final Point eighteen = new Point(36.598682, 138.189763);
    private final Point nineteen = new Point(40.776450, -111.948922);
    private final Point twenty = new Point(45.069149, 7.688681);
    private final Point twentyOne = new Point(49.284600, -123.116894);
    private final Point twentyTwo = new Point(43.585472, 39.723098);
    private final Point twentyThree = new Point(37.369612, 128.392323);
    private final Point twentyFour = new Point(39.901850, 116.391441);



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        MapKitFactory.setApiKey("8d3fa995-1909-484e-8159-2b4457ebd53e");
        MapKitFactory.initialize(this);

        setContentView(R.layout.activity_main);
        mapview = (MapView)findViewById(R.id.mapview);
        MapObjectCollection pointCollection = mapview.getMap().getMapObjects().addCollection();
        PlacemarkMapObject placemark = pointCollection.addPlacemark(one);
        placemark.setIcon(ImageProvider.fromResource(this,R.drawable.pin));
        PlacemarkMapObject placemark1 = pointCollection.addPlacemark(two);
        placemark1.setIcon(ImageProvider.fromResource(this,R.drawable.pin));
        PlacemarkMapObject placemark2 = pointCollection.addPlacemark(three);
        placemark2.setIcon(ImageProvider.fromResource(this,R.drawable.pin));
        PlacemarkMapObject placemark3 = pointCollection.addPlacemark(four);
        placemark3.setIcon(ImageProvider.fromResource(this,R.drawable.pin));
        PlacemarkMapObject placemark4 = pointCollection.addPlacemark(five);
        placemark4.setIcon(ImageProvider.fromResource(this,R.drawable.pin));
        PlacemarkMapObject placemark5 = pointCollection.addPlacemark(six);
        placemark5.setIcon(ImageProvider.fromResource(this,R.drawable.pin));
        PlacemarkMapObject placemark6 = pointCollection.addPlacemark(seven);
        placemark6.setIcon(ImageProvider.fromResource(this,R.drawable.pin));
        PlacemarkMapObject placemark7 = pointCollection.addPlacemark(eight);
        placemark7.setIcon(ImageProvider.fromResource(this,R.drawable.pin));
        PlacemarkMapObject placemark8 = pointCollection.addPlacemark(nine);
        placemark8.setIcon(ImageProvider.fromResource(this,R.drawable.pin));
        PlacemarkMapObject placemark9 = pointCollection.addPlacemark(ten);
        placemark9.setIcon(ImageProvider.fromResource(this,R.drawable.pin));
        PlacemarkMapObject placemark10 = pointCollection.addPlacemark(eleven);
        placemark10.setIcon(ImageProvider.fromResource(this,R.drawable.pin));
        PlacemarkMapObject placemark11 = pointCollection.addPlacemark(twelve);
        placemark11.setIcon(ImageProvider.fromResource(this,R.drawable.pin));
        PlacemarkMapObject placemark12 = pointCollection.addPlacemark(threeteen);
        placemark12.setIcon(ImageProvider.fromResource(this,R.drawable.pin));
        PlacemarkMapObject placemark13 = pointCollection.addPlacemark(fourteen);
        placemark13.setIcon(ImageProvider.fromResource(this,R.drawable.pin));
        PlacemarkMapObject placemark14 = pointCollection.addPlacemark(fifteen);
        placemark14.setIcon(ImageProvider.fromResource(this,R.drawable.pin));
        PlacemarkMapObject placemark15 = pointCollection.addPlacemark(sixteen);
        placemark15.setIcon(ImageProvider.fromResource(this,R.drawable.pin));
        PlacemarkMapObject placemark16 = pointCollection.addPlacemark(seventeen);
        placemark16.setIcon(ImageProvider.fromResource(this,R.drawable.pin));
        PlacemarkMapObject placemark17 = pointCollection.addPlacemark(eighteen);
        placemark17.setIcon(ImageProvider.fromResource(this,R.drawable.pin));
        PlacemarkMapObject placemark18 = pointCollection.addPlacemark(nineteen);
        placemark18.setIcon(ImageProvider.fromResource(this,R.drawable.pin));
        PlacemarkMapObject placemark19 = pointCollection.addPlacemark(twenty);
        placemark19.setIcon(ImageProvider.fromResource(this,R.drawable.pin));
        PlacemarkMapObject placemark20 = pointCollection.addPlacemark(twentyOne);
        placemark20.setIcon(ImageProvider.fromResource(this,R.drawable.pin));
        PlacemarkMapObject placemark21 = pointCollection.addPlacemark(twentyTwo);
        placemark21.setIcon(ImageProvider.fromResource(this,R.drawable.pin));
        PlacemarkMapObject placemark22 = pointCollection.addPlacemark(twentyThree);
        placemark22.setIcon(ImageProvider.fromResource(this,R.drawable.pin));
        PlacemarkMapObject placemark23 = pointCollection.addPlacemark(twentyFour);
        placemark23.setIcon(ImageProvider.fromResource(this,R.drawable.pin));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        TextView textView = findViewById(R.id.textView);

        switch (id){
            case R.id.action_one:
                mapview.getMap().move(new CameraPosition((one),11.0f,0.0f,0.0f),
                        new Animation(Animation.Type.SMOOTH,0),null);
                textView.setVisibility(View.VISIBLE);
                textView.setText("Год проведения: 1924; \t" +
                        "Количество стран-участников: 16; \t" +
                        "Всего участвовало спортсменов: 293; \t" +
                        "Количество дисциплин: 16; \t" +
                        "Количиство видов спорта: 4.");
                return true;
            case R.id.two:
                mapview.getMap().move(new CameraPosition((two),11.0f,0.0f,0.0f),
                        new Animation(Animation.Type.SMOOTH,0),null);
                textView.setVisibility(View.VISIBLE);
                textView.setText("Год проведения: 1928; \t" +
                        "Количество стран-участников: 25; \t" +
                        "Всего участвовало спортсменов: 464; \t" +
                        "Количество дисциплин: 14; \t" +
                        "Количиство видов спорта: 4.");
                return true;
            case R.id.three:
                mapview.getMap().move(new CameraPosition((three),11.0f,0.0f,0.0f),
                        new Animation(Animation.Type.SMOOTH,0),null);
                textView.setVisibility(View.VISIBLE);
                textView.setText("Год проведения: 1932; \t" +
                        "Количество стран-участников: 17; \t" +
                        "Всего участвовало спортсменов: 252; \t" +
                        "Количество дисциплин: 14; \t" +
                        "Количиство видов спорта: 4.");
                return true;
            case R.id.four:
                mapview.getMap().move(new CameraPosition((four),11.0f,0.0f,0.0f),
                        new Animation(Animation.Type.SMOOTH,0),null);
                textView.setVisibility(View.VISIBLE);
                textView.setText("Год проведения: 1936; \t" +
                        "Количество стран-участников: 28; \t" +
                        "Всего участвовало спортсменов: 646; \t" +
                        "Количество дисциплин: 17; \t" +
                        "Количиство видов спорта: 4.");
                return true;
            case R.id.five:
                mapview.getMap().move(new CameraPosition((five),11.0f,0.0f,0.0f),
                        new Animation(Animation.Type.SMOOTH,0),null);
                textView.setVisibility(View.VISIBLE);
                textView.setText("Год проведения: 1948; \t" +
                        "Количество стран-участников: 28; \t" +
                        "Всего участвовало спортсменов: 669; \t" +
                        "Количество дисциплин: 22; \t" +
                        "Количиство видов спорта: 4.");
                return true;
            case R.id.six:
                mapview.getMap().move(new CameraPosition((six),11.0f,0.0f,0.0f),
                        new Animation(Animation.Type.SMOOTH,0),null);
                textView.setVisibility(View.VISIBLE);
                textView.setText("Год проведения: 1952; \t" +
                        "Количество стран-участников: 30; \t" +
                        "Всего участвовало спортсменов: 694; \t" +
                        "Количество дисциплин: 22; \t" +
                        "Количиство видов спорта: 4.");
                return true;
            case R.id.seven:
                mapview.getMap().move(new CameraPosition((seven),11.0f,0.0f,0.0f),
                        new Animation(Animation.Type.SMOOTH,0),null);
                textView.setVisibility(View.VISIBLE);
                textView.setText("Год проведения: 1956; \t" +
                        "Количество стран-участников: 32; \t" +
                        "Всего участвовало спортсменов: 821; \t" +
                        "Количество дисциплин: 24; \t" +
                        "Количиство видов спорта: 4.");
                return true;
            case R.id.eight:
                mapview.getMap().move(new CameraPosition((eight),11.0f,0.0f,0.0f),
                        new Animation(Animation.Type.SMOOTH,0),null);
                textView.setVisibility(View.VISIBLE);
                textView.setText("Год проведения: 1960; \t" +
                        "Количество стран-участников: 30; \t" +
                        "Всего участвовало спортсменов: 665; \t" +
                        "Количество дисциплин: 27; \t" +
                        "Количиство видов спорта: 4.");
                return true;
            case R.id.nine:
                mapview.getMap().move(new CameraPosition((nine),11.0f,0.0f,0.0f),
                        new Animation(Animation.Type.SMOOTH,0),null);
                textView.setVisibility(View.VISIBLE);
                textView.setText("Год проведения: 1964; \t" +
                        "Количество стран-участников: 36; \t" +
                        "Всего участвовало спортсменов: 1091; \t" +
                        "Количество дисциплин: 34; \t" +
                        "Количиство видов спорта: 6.");
                return true;
            case R.id.ten:
                mapview.getMap().move(new CameraPosition((ten),11.0f,0.0f,0.0f),
                        new Animation(Animation.Type.SMOOTH,0),null);
                textView.setVisibility(View.VISIBLE);
                textView.setText("Год проведения: 1968; \t" +
                        "Количество стран-участников: 37; \t" +
                        "Всего участвовало спортсменов: 1158; \t" +
                        "Количество дисциплин: 35; \t" +
                        "Количиство видов спорта: 6.");
                return true;
            case R.id.eleven:
                mapview.getMap().move(new CameraPosition((eleven),11.0f,0.0f,0.0f),
                        new Animation(Animation.Type.SMOOTH,0),null);
                textView.setVisibility(View.VISIBLE);
                textView.setText("Год проведения: 1972; \t" +
                        "Количество стран-участников: 35; \t" +
                        "Всего участвовало спортсменов: 1006; \t" +
                        "Количество дисциплин: 35; \t" +
                        "Количиство видов спорта: 6.");
                return true;
            case R.id.twelve:
                mapview.getMap().move(new CameraPosition((twelve),11.0f,0.0f,0.0f),
                        new Animation(Animation.Type.SMOOTH,0),null);
                textView.setVisibility(View.VISIBLE);
                textView.setText("Год проведения: 1976; \t" +
                        "Количество стран-участников: 37; \t" +
                        "Всего участвовало спортсменов: 1123; \t" +
                        "Количество дисциплин: 37; \t" +
                        "Количиство видов спорта: 6.");
                return true;
            case R.id.threeteen:
                mapview.getMap().move(new CameraPosition((threeteen),11.0f,0.0f,0.0f),
                        new Animation(Animation.Type.SMOOTH,0),null);
                textView.setVisibility(View.VISIBLE);
                textView.setText("Год проведения: 1980; \t" +
                        "Количество стран-участников: 37; \t" +
                        "Всего участвовало спортсменов: 1072; \t" +
                        "Количество дисциплин: 38; \t" +
                        "Количиство видов спорта: 6.");
                return true;
            case R.id.fourteen:
                mapview.getMap().move(new CameraPosition((fourteen),11.0f,0.0f,0.0f),
                        new Animation(Animation.Type.SMOOTH,0),null);
                textView.setVisibility(View.VISIBLE);
                textView.setText("Год проведения: 1984; \t" +
                        "Количество стран-участников: 49; \t" +
                        "Всего участвовало спортсменов: 1272; \t" +
                        "Количество дисциплин: 39; \t" +
                        "Количиство видов спорта: 6.");
                return true;
            case R.id.fiveteen:
                mapview.getMap().move(new CameraPosition((fifteen),11.0f,0.0f,0.0f),
                        new Animation(Animation.Type.SMOOTH,0),null);
                textView.setVisibility(View.VISIBLE);
                textView.setText("Год проведения: 1988; \t" +
                        "Количество стран-участников: 57; \t" +
                        "Всего участвовало спортсменов: 1423; \t" +
                        "Количество дисциплин: 46; \t" +
                        "Количиство видов спорта: 6.");
                return true;
            case R.id.sixteen:
                mapview.getMap().move(new CameraPosition((sixteen),11.0f,0.0f,0.0f),
                        new Animation(Animation.Type.SMOOTH,0),null);
                textView.setVisibility(View.VISIBLE);
                textView.setText("Год проведения: 1992; \t" +
                        "Количество стран-участников: 64; \t" +
                        "Всего участвовало спортсменов: 1081; \t" +
                        "Количество дисциплин: 57; \t" +
                        "Количиство видов спорта: 6.");
                return true;
            case R.id.seventeen:
                mapview.getMap().move(new CameraPosition((seventeen),11.0f,0.0f,0.0f),
                        new Animation(Animation.Type.SMOOTH,0),null);
                textView.setVisibility(View.VISIBLE);
                textView.setText("Год проведения: 1994; \t" +
                        "Количество стран-участников: 67; \t" +
                        "Всего участвовало спортсменов: 1739; \t" +
                        "Количество дисциплин: 61; \t" +
                        "Количиство видов спорта: 6.");
                return true;
            case R.id.eighteen:
                mapview.getMap().move(new CameraPosition((eighteen),11.0f,0.0f,0.0f),
                        new Animation(Animation.Type.SMOOTH,0),null);
                textView.setVisibility(View.VISIBLE);
                textView.setText("Год проведения: 1998; \t" +
                        "Количество стран-участников: 72; \t" +
                        "Всего участвовало спортсменов: 2302; \t" +
                        "Количество дисциплин: 68; \t" +
                        "Количиство видов спорта: 7.");
                return true;
            case R.id.nineteen:
                mapview.getMap().move(new CameraPosition((nineteen),11.0f,0.0f,0.0f),
                        new Animation(Animation.Type.SMOOTH,0),null);
                textView.setVisibility(View.VISIBLE);
                textView.setText("Год проведения: 2002; \t" +
                        "Количество стран-участников: 77; \t" +
                        "Всего участвовало спортсменов: 2399; \t" +
                        "Количество дисциплин: 78; \t" +
                        "Количиство видов спорта: 7.");
                return true;
            case R.id.twenty:
                mapview.getMap().move(new CameraPosition((twenty),11.0f,0.0f,0.0f),
                        new Animation(Animation.Type.SMOOTH,0),null);
                textView.setVisibility(View.VISIBLE);
                textView.setText("Год проведения: 2006; \t" +
                        "Количество стран-участников: 80; \t" +
                        "Всего участвовало спортсменов: 2508; \t" +
                        "Количество дисциплин: 84; \t" +
                        "Количиство видов спорта: 7.");
                return true;
            case R.id.twenyone:
                mapview.getMap().move(new CameraPosition((twentyOne),11.0f,0.0f,0.0f),
                        new Animation(Animation.Type.SMOOTH,0),null);
                textView.setVisibility(View.VISIBLE);
                textView.setText("Год проведения: 2010; \t" +
                        "Количество стран-участников: 82; \t" +
                        "Всего участвовало спортсменов: 2766; \t" +
                        "Количество дисциплин: 86; \t" +
                        "Количиство видов спорта: 7.");
                return true;
            case R.id.twentytwo:
                mapview.getMap().move(new CameraPosition((twentyTwo),11.0f,0.0f,0.0f),
                        new Animation(Animation.Type.SMOOTH,0),null);
                textView.setVisibility(View.VISIBLE);
                textView.setText("Год проведения: 1914; \t" +
                        "Количество стран-участников: 88; \t" +
                        "Всего участвовало спортсменов: 2800; \t" +
                        "Количество дисциплин: 98; \t" +
                        "Количиство видов спорта: 7.");
                return true;
            case R.id.twentythree:
                mapview.getMap().move(new CameraPosition((twentyThree),11.0f,0.0f,0.0f),
                        new Animation(Animation.Type.SMOOTH,0),null);
                textView.setVisibility(View.VISIBLE);
                textView.setText("Год проведения: 2018; \t" +
                        "Количество стран-участников: 92; \t" +
                        "Всего участвовало спортсменов: 2922; \t" +
                        "Количество дисциплин: 102; \t" +
                        "Количиство видов спорта: 7.");
                return true;
            case R.id.twentyfour:
                mapview.getMap().move(new CameraPosition((twentyFour),11.0f,0.0f,0.0f),
                        new Animation(Animation.Type.SMOOTH,0),null);
                textView.setVisibility(View.VISIBLE);
                textView.setText("Год проведения: 2022; \t" +
                        "Количество стран-участников: 95; \t" +
                        "Всего участвовало спортсменов: 3000; \t" +
                        "Количество дисциплин: 109; \t" +
                        "Количиство видов спорта: 7.");
                return true;
        }

        return super.onOptionsItemSelected(item);

    }

    @Override
    protected void onStop() {
        super.onStop();
        mapview.onStop();
        MapKitFactory.getInstance().onStop();

    }

    @Override
    protected void onStart() {
        super.onStart();
        mapview.onStart();
        MapKitFactory.getInstance().onStart();
    }
}