package service;
import model.User;
public class AstroCalculator {
	public String findSign(User user) 
	{
	
		String[] dob = user.getDob().split("-");
		int date = Integer.parseInt(dob[0]);
		int month = Integer.parseInt(dob[1]);
		int year = Integer.parseInt(dob[2]);
		String sign="";
		switch (month)
		{
		      case 1:
		        	if (date < 20)
			            sign = "Capricorn";
			         else
			            sign = "Aquarius";
					break;
				

				case 2:
					if (date < 19)
			            sign = "Aquarius";
			         else
			            sign = "Pisces";
					
					break;
				

				case 3:
					if (date < 21)
			            sign = "Pisces";
			         else
			            sign = "Aries";
					
					break;
				

				case 4:
					 if (date < 20)
				            sign = "Aries";
				         else
				            sign = "Taurus";
					
					break;
				

				case 5:
					 if (date < 21)
				            sign = "Taurus";
				         else
				            sign = "Gemini";
					
					break;
				

				case 6:
					if (date < 21)
			            sign = "Gemini";
			         else
			            sign = "Cancer";
					
					break;
				

				case 7:
					 if (date < 23)
				            sign = "Cancer";
				         else
				            sign = "Leo";
					break;
				

				case 8:
					 if (date < 23)
				            sign = "Leo";
				         else
				            sign = "Virgo";
					
					break;
				

				case 9:
					   if (date < 23)
				            sign = "Virgo";
				         else
				            sign = "Libra";
					
					break;
				

				case 10:
					 if (date < 23)
				            sign = "Libra";
				         else
				            sign = "Scorpio";
					
					break;
				

				case 11:
					if(date < 22)
						sign =  "Scorpio";
					else 
						sign =  "Sagittarius";
					break;
					
					
				

				case 12:
					if (date < 22)
			            sign = "Sagittarius";
			         else
			            sign ="Capricorn";
					
					break;
				

				default:
					break;
				}
				
				
				return sign;
				
			}
		}
	