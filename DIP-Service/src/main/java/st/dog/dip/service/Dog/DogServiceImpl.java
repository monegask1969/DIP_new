/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.service.Dog;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import st.dog.dip.domain.Contest.Contest;
import st.dog.dip.domain.Contest.ContestDAO;
import st.dog.dip.domain.Dog.Dog;
import st.dog.dip.domain.Dog.DogDAO;
import st.dog.dip.service.ODEException.ODEException;

/**
 *
 * @author moneg
 */
public class DogServiceImpl implements DogService{

    @Autowired
    private DogDAO dogDao;
    
    @Override
    public Dog getById(int id) {
         Dog d = null;
        try{
            d = dogDao.getById(id);
            if(d == null){
                throw new ODEException("such Dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Dog does not exist");
            throw ex;
        }
        return c;
    }

    @Override
    public Dog getByBreed(String breed) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dog getByGender(String gender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dog getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dog getByDob(Date dob) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dog getByColor(String color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dog getByChip(String chip) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dog getByBrand(String brand) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dog getByPedigree(String pedigree) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dog getBySire(String sire) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dog getByDam(String dam) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dog getByFciGroup(int fcigroup) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dog getByOwnerId(int ownerid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dog getByBreederId(int breederid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Dog> getList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
