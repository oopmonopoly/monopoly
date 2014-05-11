package monopl;

import java.awt.event.*;
import java.awt.*;
public class manager {
	 
	player one;
	player two;
	
	public int Properties[][] = {

		{ -1, -1, -1, -1, -1, -1 ,  -1,  -1, -1, -1, -1, -1, -1},	//Go		0        **
		{  0,  0,  2, 10, 30,  90, 160, 250, 60, 30, 50,  3,  3},	//  1 "Takseem St.
		{ -1, -1, -1, -1, -1,  -1,  -1,  -1, -1, -1, -1, -1, -1},	//Community Chest2   **
		{  0,  0,  4, 20, 60, 180, 320, 450, 60, 30, 50,  1,  1},	//Jumhurai St.3
		{ -1, -1, -1, -1, -1,  -1,  -1,  -1, -1, -1, -1, -1, -1},	//Income Tax	4    **
		{  0, -1, 25, -1, -1,  -1,  -1,  -1,200,100, -1, -1, -1},	//Kadekoy",5
		{  0,  0,  6, 30, 90, 270, 400, 550,100, 50, 50,  8,  9},	//	"Dental St.6
		{ -1, -1, -1, -1, -1,  -1,  -1,  -1, -1, -1, -1, -1, -1},	//Chance7             **
		{  0,  0,  6, 30, 90, 270, 400, 550,100, 50, 50,  6,  9},	//	Ardogan St.	8
		{  0,  0,  8, 40,100, 300, 450, 600,120, 60, 50,  6,  8},	//Ardogan St.	9
		{ -1, -1, -1, -1, -1,  -1,  -1,  -1, -1, -1, -1, -1, -1},	//Prison10            **
		{  0,  0, 10, 50,150, 450, 625, 750,140, 70,100, 13, 14},	//Airport St.	11
		{  0, -1, 24, 24, 24,  -1,  -1,  -1,150, 75, -1, 28, 28},	//Hader pasha St.12
		{  0,  0, 10, 50,150, 450, 625, 750,140, 70,100, 11, 14},	//Sabeha St.",	13
		{  0,  0, 12, 60,180, 500, 700, 900,160, 80,100, 11, 13},	//Anwer pasha St.",	14
		{  0, -1, 25, -1, -1,  -1,  -1,  -1,200,100, -1, -1, -1},	//	Kilan pasha St."t.15
		{  0,  0, 14, 70,200, 550, 750, 950,180, 90,100, 18, 19},	//"AltonyZada St.",16
		{ -1, -1, -1, -1, -1,  -1,  -1,  -1, -1, -1, -1, -1, -1},	//Community Chest17    **
		{  0,  0, 14, 70,200, 550, 750, 950,180, 90,100, 16, 19},	//Ahmed pasha St.18
		{  0,  0, 16, 80,220, 600, 800,1000,200,100,100, 16, 18},	//Mahmed fatah St.19
		{ -1,  500, -1, -1, -1,  -1,  -1,  -1, -1, -1, -1, -1, -1},	//Free Parking	20     **
		{  0,  0, 18, 90,250, 700, 875,1050,220,110,150, 23, 24},	//Kentucky St	21
		{ -1, -1, -1, -1, -1,  -1,  -1,  -1, -1, -1, -1, -1, -1},	//Chance	22         **
		{  0,  0, 18, 90,250, 700, 875,1050,220,110,150, 21, 24},	//Nozad St.	23
		{  0,  0, 20,100,300, 750, 925,1100,240,120,150, 21, 23},	//Agibaden St.	24
		{  0, -1, 25, -1, -1,  -1,  -1,  -1,200,100, -1, -1, -1},	//Zaton St.	25
		{  0,  0, 22,110,330, 800, 975,1150,260,130,150, 27, 29},	//	Mursaee St.	26
		{  0,  0, 22,110,330, 800, 975,1150,260,130,150, 26, 29},	//	Baker St.	27
		{  0, -1, 24, 24, 24,  -1,  -1,  -1,150, 75, -1, 12, 12},	//Yosef pasha St.28
		{  0,  0, 24,120,360, 850,1025,1200,280,140,150, 26, 27},	//	Kalel pasha St.	29
		{ -1, -1, -1, -1, -1,  -1,  -1,  -1, -1, -1, -1, -1, -1},	//Go to Prison 30        **
		{  0,  0, 26,130,390, 900,1100,1275,300,150,200, 32, 34},	//	Burhanai St.31
		{  0,  0, 26,130,390, 900,1100,1275,300,150,200, 31, 34},	//	Amneant St.32
		{ -1, -1, -1, -1, -1,  -1,  -1,  -1, -1, -1, -1, -1, -1},	//Community Chest33     **
		{  0,  0, 28,150,450,1000,1200,1400,320,160,200, 31, 32},	//	Sport St.34
		{  0, -1, 25, -1, -1,  -1,  -1,  -1,200,100, -1, -1, -1},	//University St.34
		{ -1, -1, -1, -1, -1,  -1,  -1,  -1, -1, -1, -1, -1, -1},	//Chance36              **
		{  0,  0, 35,175,500,1100,1300,1500,350,175,200, 39, 39},	//Kartel St37
		{ -1, -1, -1, -1, -1,  -1,  -1,  -1, -1, -1, -1, -1, -1},	//Luxury Tax38          **
		{  0,  0, 50,200,600,1400,1700,2000,400,200,200, 37, 37}	//Chekmakoy St39
	};
	// list of the names of the properties.
	public String List[] = {
		"Go",
		"Takseem St.", 
		"cummunity chest",
		"Jumhurai St.",
		"Income Tax",
		"Kadekoy",
		"Dental St.",
		"Chance",
		"Ardogan St.",
		"airport st.",
		"prison",
		"Hader pasha St.",
		"Nisan Company",
		"Sabeha St.",
		"Anwer pasha St.",
		"Kilan pasha St.",
		"AltonyZada St.",
		"Community Chest",
		"Ahmed pasha St.",
		"Mahmed fatah St.",
		"Free Parking	.",
		"Kentucky St.",
		"Chance",
		"Nozad St.",
		"Agibaden St.",
		"Zaton St.",
		"Mursaee St.",
		"Baker St.",
		"Yosef pasha St.",
		"Kalel pasha St.",
		"Go to Prison",
		"Burhanai St.",
		"Amneant St.",
		"Community Chest",
		"Sport St.",
		"Universty St.",
		"Chance",
		"Kartal St.",
		"Luxury Tax38",
		"Chekmakoy St."
	};
	//Chance strings
	String chance[] = {
		"Pay poor tax of $15.", 
		"Make repairs to property.  Pay $200.",
		"Advance to kadekoy.",
		"Go back 3 spaces.",
		"Your building  Collect $150.",
		"Take a walk on the Board Walk.",
		"Advance to zeton.s",
		"Elected Chairman of the Board, pay $50.",
		"Take a ride on the Reading.  If owned, pay twice the amount.",
		"Bank pays you dividend of $50.",
		"Advance to Go.",
		"Go directly to Prison."
	};
	//Community Chest strings
	String cchest[] = {
		"Go   to Prison",
		"Second prize in a beauty contest.  Collect $10.",
		"Bank error in your favor.  Collect $200.",
		"Doctor's fee, Pay $50.",
		"Christmas Fund matures, Collect $100.",
		"Grand Opening.  Collect $50.",
		"Advance to Go.",
		"Life insurance matures, Collect $100.",
		"Pay school tax of $150.",
		"Assessed for street repairs.  Pay $150.",
		"You inherit $100.",
		"From Sale of stock, you get $45.",
		"Pay Hospital $100.",
		"Income tax refund, Collect $20."
	};
	
	
	// method manager

	public  manager( player a, player b ) {
		one = a;
		two = b;
	}
	// Used to draw the stats of the property last landed on.
	
	
	public void DrawPropertyStats( int PropertyNum, int x, int y, Graphics g ) {
		
		
		// properties is array 40 colon*13 row ;...propertyNum :integer
		//method to check and draw which property player has landed on!
		
		g.setColor( Color.black );
		g.setFont( new Font( "areal", Font.BOLD, 15 ) );
		g.drawString( List[PropertyNum], x+8, y+25 );
		g.setFont( new Font( "Verdana", Font.PLAIN, 12 +1) );
		if( Properties[PropertyNum][0] == 0 )//	ÇÐÇ Þíã ÇáãÕÝÝæÝÉ ÕÝÑ íÚäí ÇÔÊÑí æÇáÇ ÑæÍ áË
		{
			g.drawString( "This property is not owned.", x+8, y+65 );//ÑÓã ÇáÚÈÇÑÉ Ýí ÇáãæÞÚ x+8, y+65
			g.drawString( "Price to Buy: Turkish Lera " + Properties[PropertyNum][4], x+8, y+80 ); //åã ÑÓã ÇáÚÈÇÑÉ 
 		}
		
		else
			
			if( Properties[PropertyNum][0] == 1 || Properties[PropertyNum][0] == 2 ) 
			{
			String owner = ( Properties[PropertyNum][0] == 1 )? one.Name : two.Name;
			g.drawString( "Owned by " + owner, x+8, y+65 );
			if( Properties[PropertyNum][Properties[PropertyNum][1]+2] != -1 && 
				PropertyNum != 12 && PropertyNum != 28 )
					g.drawString( "Tresspassing Price: $" +  
						Properties[PropertyNum][Properties[PropertyNum][1]+2], x+8, y+85 );
			
			else
					g.drawString( "Tresspassing Price: $" +  
						Properties[PropertyNum][Properties[PropertyNum][1]+3], x+8, y+85 );

			int h = Properties[PropertyNum][1];
			if( h == 5 )
				g.drawString( "This property has a Hotel", x+8, y+100 );
			else if
			
			( h != -1 )
				g.drawString( "This property has " + h + " houses.", x+8, y+75 );
			if( Properties[PropertyNum][10] != -1 )
				g.drawString( "Houses cost $" + Properties[PropertyNum][10], x+8, y+95 );
		}
	}
	
	
	
	
	
	// Check to see if the player owes any money or landed on chance, cchest, etc.
	public String CheckProperty( int playerNum, int position ) {
		if( position == 12 || position == 28 ) {
			int r = ( int )( Math.random() * 12 );
			if( playerNum == 1 ) {
				if( Properties[12][0] == 2 )
				{
					if( Properties[28][0] == 2 )
					{
						one.Money -= 10*r;
						Properties[28][2] = 10*r;
						Properties[12][2] = 10*r;
						Properties[28][3] = 10*r;
						Properties[12][3] = 10*r;
						Properties[28][4] = 10*r;
						Properties[12][5] = 10*r;
					}
					else {
						Properties[28][2] = 4*r;
						Properties[28][3] = 4*r;
						Properties[28][4] = 4*r;
						one.Money -= 4*r;
					}
				}
				else if( Properties[28][0] == 2 ) {
					if( Properties[12][0] == 2 ) {
						one.Money -= 10*r;
						Properties[28][2] = 10*r;
						Properties[12][2] = 10*r;
						Properties[28][3] = 10*r;
						Properties[12][3] = 10*r;
						Properties[28][3] = 10*r;
						Properties[12][3] = 10*r;
					}
					else {
						Properties[28][2] = 4*r;
						Properties[28][3] = 4*r;
						Properties[28][4] = 4*r;
						one.Money -= 4*r;
					}
				}
			}
			else {
				if( Properties[12][0] == 1 ){
					if( Properties[28][0] == 1 ) {
						two.Money -= 10*r;
						Properties[28][2] = 10*r;
						Properties[12][2] = 10*r;
						Properties[28][3] = 10*r;
						Properties[12][3] = 10*r;
						Properties[28][4] = 10*r;
						Properties[12][5] = 10*r;
					}
					else {
						Properties[28][2] = 4*r;
						Properties[28][3] = 4*r;
						Properties[28][4] = 4*r;
						two.Money -= 4*r;
					}
				}
				else if( Properties[28][0] == 1 ) {
					if( Properties[12][0] == 1 ) {
						two.Money -= 10*r;
						Properties[28][2] = 10*r;
						Properties[12][2] = 10*r;
						Properties[28][3] = 10*r;
						Properties[12][3] = 10*r;
						Properties[28][4] = 10*r;
						Properties[12][4] = 10*r;
					}
					else {
						Properties[28][2] = 4*r;
						Properties[28][3] = 4*r;
						Properties[28][4] = 4*r;
						two.Money -= 4*r;
					}
				}
			}
		}
		if( position == 5 || position == 15 || position == 25 || position == 35 )
		{
			if( playerNum == 1 && Properties[position][0] == 2 &&position!= 12 &&position!=28) 
			{
				one.Money -= Properties[position][Properties[position][1]+3];
				two.Money += Properties[position][Properties[position][1]+3];
			}
						
			
			else if
			( playerNum == 2 && Properties[position][0] == 1 &&position!= 12 &&position!=28 ) {
				one.Money += Properties[position][Properties[position][1]+3];
				two.Money -= Properties[position][Properties[position][1]+3];
			}
		}
		
		
		else if( playerNum == 1  &&  Properties[position][0] == 2 &&position!= 12 &&position!=28 ) {
			one.Money -= Properties[position][Properties[position][1]+2];
			two.Money += Properties[position][Properties[position][1]+2];
		}
		
		
		else if( playerNum == 2  &&  Properties[position][0] == 1 &&position!= 12 &&position!=28 ) {
			one.Money += Properties[position][Properties[position][1]+2];
			two.Money -= Properties[position][Properties[position][1]+2];
		}
		if( playerNum == 1 ) {
			if( one.Position == 30 ) {		//if on 'Go to Prison'
				one.inPrison = true;
				one.Position = 10;
			}
			
			
			else if( one.Position == 20 ) {	//if on 'Free Parking'
				System.out.println(one.Name+" gained $" +Properties[20][1]+" for landing on free parking");
				one.Money += Properties[20][1];
				Properties[20][1] = 500;
			}
			
			
			else if( one.Position == 4 ) {	//if on 'Income Tax'
				one.Money -= 200;
				Properties[20][1] += 200;
			}
			
			
			else if( one.Position == 38 ) {	//if on 'Luxury Tax'
				one.Money -= 75;
				Properties[20][1] += 75;
			}
			
			
			else if( one.Position == 7  ||	//if on 'Chance'
				   one.Position == 22 ||
				   one.Position == 36   )
					return Chance( 1 );
			else if
			
			( one.Position == 2  ||	//if on 'Comm. Chest'
				   one.Position == 17 ||
				   one.Position == 33   )
					return CChest( 1 );

		}
		
		
		else if( playerNum == 2 ) {
			if( two.Position == 30 ) {		//if on 'Go to Prison'
				two.inPrison = true;
				two.Position = 10;
			}
			
			
			else if
			
			( two.Position == 20 ) {	//if on 'Free Parking'
				two.Money += Properties[20][1];
				Properties[20][1] = 500;
			}
			else if
			
			( two.Position == 4 ) {	//if on 'Income Tax'
				two.Money -= 200;
				Properties[20][1] += 200;
			}
			else if
			
			( two.Position == 38 ) {	//if on 'Luxury Tax'
				two.Money -= 75;
				Properties[20][1] += 75;
			}
			else if
			
			( two.Position == 7  ||	//if on 'Chance'
				   two.Position == 22 ||
				   two.Position == 36   ) {
					return Chance( 2 );
			}
			else if
			
			( two.Position == 2  ||	//if on 'Comm. Chest'
				   two.Position == 17 ||
				   two.Position == 33   ) {
					return CChest( 2 );
			}
		}
		return "";
	}
	public String Chance( int pn ) {
		int r = ( int )( Math.random() * chance.length );
		if( pn == 1 ) {
			switch( r ) {
				case 0:
					one.Money-=15;
					Properties[20][1] += 15;
					break;
				case 1:
					one.Money-=200;
					Properties[20][1] += 200;
					break;
				case 2:
					if( one.Position >= 24 )
						one.Money+=200;
					one.Position = 24;
					if( Properties[24][0] == 2 ) {
						one.Money -= Properties[24][Properties[24][1]+2];
						two.Money += Properties[24][Properties[24][1]+2];
					}
					break;
				case 3:
					one.Position -= 3;
					if( one.Position == 4 ) {
						one.Money -= 200;
						Properties[20][1] += 200;
					}
					else if( one.Position == 19 && Properties[19][0] == 2 ) {
						one.Money -= Properties[19][Properties[19][1]+2];
						two.Money += Properties[19][Properties[19][1]+2];
					}
					break;
				case 4:
					one.Money+=150;
					break;
				case 5:
					one.Position = 39;
					if( one.Position == 39 && Properties[39][0] == 2 ) {
						one.Money -= Properties[39][Properties[19][1]+2];
						two.Money += Properties[39][Properties[19][1]+2];
					}
					break;
				case 6:
					if( one.Position >= 11 )
						one.Money+=200;
					one.Position = 11;
					break;
				case 7:
					one.Money-=50;
					Properties[20][1] += 50;
					break;
				case 8:
					if( one.Position >= 5 )
						one.Money += 200;
					one.Position = 5;
					if( Properties[5][0] == 2 ) {
						one.Money -= 2*Properties[5][2];
						two.Money += 2*Properties[5][2];
					}
					break;
				case 9:
					one.Money+=50;
					break;
				case 10:
					one.Money+=200;
					one.Position = 0;
					break;
				case 11:
					one.inPrison = true;
					one.Position = 10;
					break;
			}
		}
		else {
			switch( r ) {
				case 0:
					two.Money-=15;
					Properties[20][1] += 15;
					break;
				case 1:
					two.Money-=200;
					Properties[20][1] += 200;
					break;
				case 2:
					if( two.Position >= 24 )
						two.Money+=200;
					two.Position = 24;
					if( Properties[24][0] == 1 ) {
						one.Money += Properties[24][Properties[24][1]+2];
						two.Money -= Properties[24][Properties[24][1]+2];
					}
					break;
				case 3:
					two.Position -= 3;
					if( two.Position == 4 ) {
						two.Money -= 200;
						Properties[20][1] += 200;
					}
					else if( two.Position == 19 && Properties[19][0] == 1 ) {
						one.Money += Properties[19][Properties[19][1]+2];
						two.Money -= Properties[19][Properties[19][1]+2];
					}
					break;
				case 4:
					two.Money+=150;
					break;
				case 5:
					two.Position = 39;
					if( two.Position == 39 && Properties[39][0] == 1 ) {
						one.Money += Properties[39][Properties[19][1]+2];
						two.Money -= Properties[39][Properties[19][1]+2];
					}
					break;
				case 6:
					if( two.Position >= 11 )
						two.Money+=200;
					two.Position = 11;
					break;
				case 7:
					two.Money-=50;
					Properties[20][1] += 50;
					break;
				case 8:
					if( two.Position >= 5 )
						two.Money += 200;
					two.Position = 5;
					if( Properties[5][0] == 1 ) {
						one.Money += 2*Properties[5][2];
						two.Money -= 2*Properties[5][2];
					}
					break;
				case 9:
					two.Money+=50;
					break;
				case 10:
					two.Money+=200;
					two.Position = 0;
					break;
				case 11:
					two.inPrison = true;
					two.Position = 10;
					break;
			}
		}
			//Draw the frame for chance
			final Frame f = new Frame(" Chance ");
			f.setSize( 400, 100 );
			f.setBackground( Color.WHITE);
			f.setLayout( new BorderLayout() );
			Label l = new Label( chance[r] );
			f.add( l, BorderLayout.CENTER );
			f.setVisible( true );
			try { Thread.sleep( 3000 ); }
			catch( Exception ex ) {}
			f.setVisible( false );
			f.addWindowListener( new WindowAdapter() {
				public void windowClosing( WindowEvent e ) {
					f.setVisible( false );
				}
			});
		return chance[r];
	}
	public String CChest( int pn ) {
		int r = ( int )( Math.random() * cchest.length );
		if( pn == 1 ) {
			switch( r ) {
				case 0:
					one.Position = 10;
					one.inPrison = true;
					break;
				case 1:
					one.Money+=10;
					break;
				case 2:
					one.Money+=200;
					break;
				case 3:
					one.Money-=50;
					Properties[20][1] += 50;
					break;
				case 4:
					one.Money+=100;
					break;
				case 5:
					one.Money+=50;
					break;
				case 6:
					one.Position = 0;
					one.Money+=200;
				case 7:
					one.Money+=100;
					break;
				case 8:
					one.Money-=150;
					Properties[20][1] += 150;
					break;
				case 9:
					one.Money-=150;
					Properties[20][1] += 150;
					break;
				case 10:
					one.Money+= 100;
					break;
				case 11:
					one.Money+=45;
					break;
				case 12:
					one.Money-=100;
					Properties[20][1] += 100;
					break;
				case 13:
					one.Money+=20;
					break;
			}
		}
		else {
			switch( r ) {
				case 0:
				
					two.Position = 10;
					two.inPrison = true;
					break;
				case 1:
					two.Money+=10;
					break;
				case 2:
					two.Money+=200;
					break;
				case 3:
					two.Money-=50;
					Properties[20][1] += 50;
					break;
				case 4:
					two.Money+=100;
					break;
				case 5:
					two.Money+=50;
					break;
				case 6:
					two.Position = 0;
					two.Money+=200;
				case 7:
					two.Money+=100;
					break;
				case 8:
					two.Money-=150;
					Properties[20][1] += 150;
					break;
				case 9:
					two.Money-=150;
					Properties[20][1] += 150;
					break;
				case 10:
					two.Money+= 100;
					break;
				case 11:
					two.Money+=45;
					break;
				case 12:
					two.Money-=100;
					Properties[20][1] += 100;
					break;
				case 13:
					two.Money+=20;
					break;
			}
		}
			//Draw the frame for cchest
					
			final Frame f2 = new Frame(" Community Chest ");
			f2.setSize( 400, 100 );
			f2.setBackground( Color.CYAN );
			f2.setLayout( new BorderLayout() );
			Label l2 = new Label( cchest[r] );
			f2.add( l2, BorderLayout.CENTER );
			f2.setVisible( true );
			try { Thread.sleep( 3000 ); }
			catch( Exception ex ) {}
			f2.setVisible( false );
			f2.addWindowListener( new WindowAdapter() {
				public void windowClosing( WindowEvent e ) {
					f2.setVisible( false );
				}
			});
		return cchest[r];
	}
}
