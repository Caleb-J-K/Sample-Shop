package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;
    private final InhousePartRepository inhousePartRepository;
    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, InhousePartRepository inhousePartRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.inhousePartRepository = inhousePartRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<InhousePart> inhouseParts =  (List<InhousePart>) inhousePartRepository.findAll();

        InhousePart ihp1 = new InhousePart();
        ihp1.setId(001);
        ihp1.setName("Original");
        ihp1.setPrice(2.50);
        ihp1.setInv(5);
        inhousePartRepository.save(ihp1);
        InhousePart thePart=null;
        inhouseParts=(List<InhousePart>) inhousePartRepository.findAll();
        for(InhousePart part:inhouseParts){
            if(part.getName().equals("Original"))thePart=part;
        }

        InhousePart ihp2 = new InhousePart();
        ihp2.setId(002);
        ihp2.setName("BBQ");
        ihp2.setPrice(2.50);
        ihp2.setInv(5);
        inhousePartRepository.save(ihp2);
        thePart=null;
        inhouseParts=(List<InhousePart>) inhousePartRepository.findAll();
        for(InhousePart part:inhouseParts){
            if(part.getName().equals("BBQ"))thePart=part;
        }

        InhousePart ihp3 = new InhousePart();
        ihp3.setId(003);
        ihp3.setName("Cheddar");
        ihp3.setPrice(2.50);
        ihp3.setInv(5);
        inhousePartRepository.save(ihp3);
        thePart=null;
        inhouseParts=(List<InhousePart>) inhousePartRepository.findAll();
        for(InhousePart part:inhouseParts){
            if(part.getName().equals("Cheddar"))thePart=part;
        }

        inhouseParts=(List<InhousePart>) inhousePartRepository.findAll();
        for(InhousePart part:inhouseParts){
            System.out.println(part.getName() + " " + part.getId());
        }

        OutsourcedPart osp1= new OutsourcedPart();
        osp1.setCompanyName("Johnny's Chip Company");
        osp1.setName("Sour Cream and Onion");
        osp1.setInv(5);
        osp1.setPrice(4.0);
        osp1.setId(004);
        outsourcedPartRepository.save(osp1);
        OutsourcedPart theOPart =null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("Sour Cream and Onion")) theOPart =part;
        }

        System.out.println(theOPart.getCompanyName());

        OutsourcedPart osp2 = new OutsourcedPart();
        osp2.setCompanyName("Johnny's Chip Company");
        osp2.setName("Jalapeno");
        osp2.setInv(5);
        osp2.setPrice(4.0);
        osp2.setId(005);
        outsourcedPartRepository.save(osp2);
        theOPart =null;
        outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("Jalapeno")) theOPart =part;
        }

        System.out.println(theOPart.getCompanyName());

        outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }


        Product original_snackbox= new Product("Original Snack Box",30.0,15);
        Product bbq_snackbox= new Product("BBQ Snack Box",30.0,15);
        Product Cheddar_snackbox= new Product("Cheddar Snack Box",30.0,15);
        Product sourcreamonion_snackbox= new Product("Sour Cream and Onion Snack Box",40.0,20);
        Product jalapeno_snackbox= new Product("BBQ Snack Box",40.0,20);

        productRepository.save(original_snackbox);
        productRepository.save(bbq_snackbox);
        productRepository.save(Cheddar_snackbox);
        productRepository.save(sourcreamonion_snackbox);
        productRepository.save(jalapeno_snackbox);


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
